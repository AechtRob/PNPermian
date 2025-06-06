package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.BiomePermianLowlandFloodplain;
import net.pnpermian.world.biome.permian.BiomePermianLowlandFloodplainLake;

public class GenLayerPermianOffshore extends GenLayer
{

    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);

    public Biome PERMIAN_DELTA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain_brake"));
    public int PERMIAN_DELTA_ID =  Biome.getIdForBiome(PERMIAN_DELTA);


    public GenLayerPermianOffshore(long seed, GenLayer genLayer)
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

                if (isOcean(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (isForDelta(l1) || isForDelta(k2) || isForDelta(j3) || isForDelta(i4))
                    {
                        aint1[j + i * areaWidth] = PERMIAN_DELTA_ID;
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

    private boolean isOcean(int biomeID) {
        if (biomeID == PERMIAN_OCEAN_ID || biomeID == PERMIAN_OCEAN_SHORE_ID) {
            return true;
        }
        return false;
    }

    private boolean isForDelta(int biomeID) {
        Biome biome = Biome.getBiome(biomeID);
        return biome == BiomePermianLowlandFloodplain.biome
                || biome == BiomePermianLowlandFloodplainLake.biome;
    }

}
