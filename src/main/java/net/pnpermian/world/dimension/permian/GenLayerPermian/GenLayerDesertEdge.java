package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerDesertEdge extends GenLayer
{

    public Biome PERMIAN_PERMIAN_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert"));
    public int PERMIAN_PERMIAN_DESERT_ID =  Biome.getIdForBiome(PERMIAN_PERMIAN_DESERT);
    public Biome PERMIAN_DESERT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert_edge"));
    public int PERMIAN_DESERT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_DESERT_EDGE);
    public Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public int PERMIAN_FLOODBASALT_ID = Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public int PERMIAN_OCEAN_ID = Biome.getIdForBiome(PERMIAN_OCEAN);
    public Biome PERMIAN_SHALLOW_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_SHALLOW_OCEAN_ID = Biome.getIdForBiome(PERMIAN_SHALLOW_OCEAN);
    public Biome PERMIAN_OCEAN_CLIFF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_cliff"));
    public int PERMIAN_OCEAN_CLIFF_ID = Biome.getIdForBiome(PERMIAN_OCEAN_CLIFF);

    public GenLayerDesertEdge(long seed, GenLayer genLayer)
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

                if (k == PERMIAN_PERMIAN_DESERT_ID)
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isDesert(l1) )
                            || (!isDesert(k2))
                            || (!isDesert(j3))
                            || (!isDesert(i4))))
                    {
                        aint1[j + i * areaWidth] = PERMIAN_DESERT_EDGE_ID;
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

    private boolean isDesert(int biomeID) {
        if (biomeID == PERMIAN_PERMIAN_DESERT_ID
                || biomeID == PERMIAN_DESERT_EDGE_ID
                || biomeID == PERMIAN_FLOODBASALT_ID
                || biomeID == PERMIAN_OCEAN_ID
                || biomeID == PERMIAN_SHALLOW_OCEAN_ID
                || biomeID == PERMIAN_OCEAN_CLIFF_ID) {
            return true;
        }
        return false;
    }

}
