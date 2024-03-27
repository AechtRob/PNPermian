package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianColdGlossopterisSwampSurface extends GenLayer
{

    public Biome PERMIAN_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_swamp"));
    public int PERMIAN_SWAMP_ID =  Biome.getIdForBiome(PERMIAN_SWAMP);
    public Biome PERMIAN_MOUNDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest"));
    public int PERMIAN_MOUNDS_ID =  Biome.getIdForBiome(PERMIAN_MOUNDS);

    public GenLayerPermianColdGlossopterisSwampSurface(long seed, GenLayer genLayer)
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

                if (k == PERMIAN_SWAMP_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isSwamp(l1) && isSwamp(k2) && isSwamp(j3) && isSwamp(i4) & nextInt(2) == 0)
                    {
                        aint1[j + i * areaWidth] = PERMIAN_MOUNDS_ID;
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

    private boolean isSwamp(int biomeID) {
        if (biomeID == PERMIAN_SWAMP_ID
            || biomeID == PERMIAN_MOUNDS_ID) {
            return true;
        }
        return false;
    }

}
