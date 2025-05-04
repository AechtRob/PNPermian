package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianCirqueLakes extends GenLayer
{

    public Biome PERMIAN_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_fern_copse"));
    public int PERMIAN_FLOODPLAIN_ID =  Biome.getIdForBiome(PERMIAN_FLOODPLAIN);

    public Biome PERMIAN_LAKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_fern_copse_lakes"));
    public int PERMIAN_LAKES_ID =  Biome.getIdForBiome(PERMIAN_LAKES);

    public GenLayerPermianCirqueLakes(long seed, GenLayer genLayer)
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

                if (k == PERMIAN_FLOODPLAIN_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isInHills(l1) && isInHills(k2) && isInHills(j3) && isInHills(i4) & nextInt(5) == 0)
                    {
                        aint1[j + i * areaWidth] = PERMIAN_LAKES_ID;
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
        if (biomeID == PERMIAN_FLOODPLAIN_ID
                || biomeID == PERMIAN_LAKES_ID) {
            return true;
        }
        return false;
    }

}
