package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDepressionTransition extends GenLayer
{

    public Biome PERMIAN_STONY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_plains"));
    public int PERMIAN_STONY_ID =  Biome.getIdForBiome(PERMIAN_STONY);
    public Biome PERMIAN_DEPRESSION = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression"));
    public int PERMIAN_DEPRESSION_ID =  Biome.getIdForBiome(PERMIAN_DEPRESSION);
    public Biome PERMIAN_SPIKE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_plains_spikes"));
    public int PERMIAN_STONY_SPIKES_ID =  Biome.getIdForBiome(PERMIAN_SPIKE);
    public Biome PERMIAN_DEPRESSION_TRANSITION = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression_rim"));
    public int PERMIAN_DEPRESSION_TRANSITION_ID =  Biome.getIdForBiome(PERMIAN_DEPRESSION_TRANSITION);

    public GenLayerDepressionTransition(long seed, GenLayer genLayer)
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

                if (isMountains(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (
                        (isSinkhole(l1) || isSinkhole(k2) || isSinkhole(j3) || isSinkhole(i4))

                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_DEPRESSION_TRANSITION_ID;
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

    private boolean isSinkhole(int biomeID) {
        if (biomeID == PERMIAN_DEPRESSION_ID) {
            return true;
        }
        return false;
    }

    private boolean isMountains(int biomeID) {
        if (biomeID == PERMIAN_STONY_ID
        || biomeID == PERMIAN_STONY_SPIKES_ID) {
            return true;
        }
        return false;
    }

}
