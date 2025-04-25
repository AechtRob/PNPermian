package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianCirque extends GenLayer
{

    public Biome PERMIAN_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_highlands"));
    public int PERMIAN_HIGHLANDS_ID =  Biome.getIdForBiome(PERMIAN_HIGHLANDS);
    public Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);

    public Biome PERMIAN_CIRQUE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_fern_copse"));
    public int PERMIAN_CIRQUE_ID =  Biome.getIdForBiome(PERMIAN_CIRQUE);

    public GenLayerPermianCirque(long seed, GenLayer genLayer)
    {
        super(seed);
        this.parent = genLayer;
    }

    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        int[] aint = this.parent.getInts(areaX - 1, areaY - 1, areaWidth + 2, areaHeight + 2);
        int[] aint1 = IntCache.getIntCache(areaWidth * areaHeight);

        for (int i = 0; i < areaHeight; ++i)
        {
            for (int j = 0; j < areaWidth; ++j)
            {
                this.initChunkSeed((long)(j + areaX), (long)(i + areaY));
                int k = aint[j + 1 + (i + 1) * (areaWidth + 2)];
                Biome biome = Biome.getBiome(k);

                if (k == PERMIAN_HIGHLANDS_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isInHills(l1) && isInHills(k2) && isInHills(j3) && isInHills(i4) & nextInt(3) == 0)
                    {
                        aint1[j + i * areaWidth] = PERMIAN_CIRQUE_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else
                {
                    aint1[j + i * areaWidth] = k;
                }
            }
        }

        return aint1;
    }

    private boolean isInHills(int biomeID) {
        if (biomeID == PERMIAN_CIRQUE_ID
                || biomeID == PERMIAN_HIGHLANDS_ID
                || biomeID == PERMIAN_MOUNTAINS_ID) {
            return true;
        }
        return false;
    }

}
