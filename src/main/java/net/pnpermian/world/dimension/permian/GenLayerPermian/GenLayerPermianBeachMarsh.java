package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianBeachMarsh extends GenLayer
{

    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public  int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public  Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public  int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public  Biome PERMIAN_OCEAN_SPONGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_sponge_reef"));
    public  int PERMIAN_OCEAN_SPONGE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SPONGE);

    public Biome PERMIAN_CATHAY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public int PERMIAN_CATHAY_ID =  Biome.getIdForBiome(PERMIAN_CATHAY);
    public  Biome PERMIAN_SALTMARSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach_saltmarsh"));
    public  int PERMIAN_SALTMARSH_ID =  Biome.getIdForBiome(PERMIAN_SALTMARSH);

    public GenLayerPermianBeachMarsh(long seed, GenLayer genLayer)
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
                //Biome biome = Biome.getBiome(k);

                if (!hasNoBeach(k))
                {
                    if (!isOcean(k))
                    {
                        int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                        int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                        int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                        int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                        if (!isOcean(l1) && !isOcean(k2) && !isOcean(j3) && !isOcean(i4))
                        {
                            aint1[j + i * areaWidth] = k;
                        }
                        else
                        {
                            aint1[j + i * areaWidth] = PERMIAN_SALTMARSH_ID;
                        }
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
        if (biomeID == PERMIAN_OCEAN_ID || biomeID == PERMIAN_OCEAN_SHORE_ID
                || biomeID == PERMIAN_OCEAN_SPONGE_ID) {
            return true;
        }
        return false;
    }

    private boolean hasNoBeach(int biomeID) {
        if (biomeID != PERMIAN_CATHAY_ID) {
            return true;
        }
        return false;
    }

}
