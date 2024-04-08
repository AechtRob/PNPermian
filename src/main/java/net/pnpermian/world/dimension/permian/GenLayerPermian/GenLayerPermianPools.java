package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianPools extends GenLayer
{

    public Biome PERMIAN_GLOSSOPTERIS_LIGHT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_light"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LIGHT);
    public Biome PERMIAN_GLOSSOPTERIS_CRAGGY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_craggy"));
    public int PERMIAN_GLOSSOPTERIS_CRAGGY_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_CRAGGY);
    public Biome PERMIAN_GLOSSOPTERIS_MEADOW = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_MEADOW);
    public Biome PERMIAN_GLOSSOPTERIS_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris_copse"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_COPSE);

    public Biome PERMIAN_GLOSSOPTERIS_WET = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_ocean"));
    public int PERMIAN_GLOSSOPTERIS_WET_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_WET);

    public GenLayerPermianPools(long seed, GenLayer genLayer)
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

                if (isGlossopterisTemperate(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isGlossopterisTemperate(l1) && isGlossopterisTemperate(k2) && isGlossopterisTemperate(j3) && isGlossopterisTemperate(i4) & nextInt(12) == 0)
                    {
                        aint1[j + i * areaWidth] = PERMIAN_GLOSSOPTERIS_WET_ID;
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

    private boolean isGlossopterisTemperate(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID) {
            return true;
        }
        return false;
    }

}
