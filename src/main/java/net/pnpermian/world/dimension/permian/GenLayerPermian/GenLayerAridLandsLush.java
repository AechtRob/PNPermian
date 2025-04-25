package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerAridLandsLush extends GenLayer
{

    public  Biome PERMIAN_ARID_LANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands"));
    public  int PERMIAN_ARID_LANDS_ID =  Biome.getIdForBiome(PERMIAN_ARID_LANDS);
    public  Biome PERMIAN_ARID_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_hills"));
    public  int PERMIAN_ARID_HILLS_ID =  Biome.getIdForBiome(PERMIAN_ARID_HILLS);
    public  Biome PERMIAN_ARID_LANDS_LUSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands_lush"));
    public  int PERMIAN_ARID_LANDS_LUSH_ID =  Biome.getIdForBiome(PERMIAN_ARID_LANDS_LUSH);

    public GenLayerAridLandsLush(long seed, GenLayer genLayer)
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

                if (isaAridLand(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isaAridLand(l1) && isaAridLand(k2) && isaAridLand(j3) && isaAridLand(i4) & nextInt(4) == 0)
                    {
                        aint1[j + i * areaWidth] = PERMIAN_ARID_LANDS_LUSH_ID;
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

    private boolean isaAridLand(int biomeID) {
        if (biomeID == PERMIAN_ARID_HILLS_ID
                || biomeID == PERMIAN_ARID_LANDS_ID) {
            return true;
        }
        return false;
    }

}
