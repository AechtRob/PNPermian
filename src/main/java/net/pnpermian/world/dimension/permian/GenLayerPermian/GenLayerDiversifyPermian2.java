package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.*;

public class GenLayerDiversifyPermian2 extends GenLayer {

    public  Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_swamp"));
    public  int PERMIAN_GLOSSOPTERIS_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public  Biome PERMIAN_GLOSSOPTERIS_LIGHT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_light"));
    public  int PERMIAN_GLOSSOPTERIS_LIGHT_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LIGHT);
    public  Biome PERMIAN_GLOSSOPTERIS_TEMPERATE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris"));
    public  int PERMIAN_GLOSSOPTERIS_TEMPERATE_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_TEMPERATE);
    public  Biome PERMIAN_ARID_LANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands"));
    public  int PERMIAN_ARID_LANDS_ID =  Biome.getIdForBiome(PERMIAN_ARID_LANDS);
    public  Biome PERMIAN_ARID_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_hills"));
    public  int PERMIAN_ARID_HILLS_ID =  Biome.getIdForBiome(PERMIAN_ARID_HILLS);
    public  Biome PERMIAN_ARID_LANDS_LUSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands_lush"));
    public  int PERMIAN_ARID_LANDS_LUSH_ID =  Biome.getIdForBiome(PERMIAN_ARID_LANDS_LUSH);
    public  Biome PERMIAN_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert"));
    public  int PERMIAN_DESERT_ID =  Biome.getIdForBiome(PERMIAN_DESERT);
    public  Biome PERMIAN_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands"));
    public  int PERMIAN_LOWLANDS_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS);
    public  Biome PERMIAN_LOWLANDS_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest"));
    public  int PERMIAN_LOWLANDS_FOREST_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FOREST);
    public  Biome PERMIAN_LOWLANDS_FOREST_DENSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest_dense"));
    public  int PERMIAN_LOWLANDS_FOREST_DENSE_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FOREST_DENSE);
    public  Biome PERMIAN_LOWLANDS_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain"));
    public  int PERMIAN_LOWLANDS_FLOODPLAIN_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FLOODPLAIN);
    public  Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public  int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public  Biome PERMIAN_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_highlands"));
    public  int PERMIAN_HIGHLANDS_ID =  Biome.getIdForBiome(PERMIAN_HIGHLANDS);
    public  Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public  int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);

     private final int DesertBiomes[] = new int[] {
        PERMIAN_DESERT_ID,
        PERMIAN_DESERT_ID,
        PERMIAN_DESERT_ID,
        PERMIAN_FLOODBASALT_ID
    };
    private final int AridBiomes[] = new int[] {
        PERMIAN_ARID_LANDS_ID,
        PERMIAN_ARID_HILLS_ID
    };
    private final int GlossopterisBiomes[] = new int[] {
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_GLOSSOPTERIS_LIGHT_ID,
        PERMIAN_GLOSSOPTERIS_LIGHT_ID,
        PERMIAN_GLOSSOPTERIS_TEMPERATE_ID,
        PERMIAN_GLOSSOPTERIS_TEMPERATE_ID
    };
    private final int LowlandsBiomes[] = new int[] {
        PERMIAN_LOWLANDS_ID,
        PERMIAN_LOWLANDS_FOREST_ID,
        PERMIAN_LOWLANDS_FLOODPLAIN_ID
    };
    private final int LowlandsWoodsBiomes[] = new int[] {
            PERMIAN_LOWLANDS_FOREST_ID,
            PERMIAN_LOWLANDS_FOREST_DENSE_ID
    };
    private final int HighlandsBiomes[] = new int[] {
        PERMIAN_HIGHLANDS_ID,
        PERMIAN_MOUNTAINS_ID
    };

    public GenLayerDiversifyPermian2(long seed, GenLayer genlayer) {
        super(seed);
        this.parent = genlayer;
    }

    @Override
    public int[] getInts(int x, int z, int width, int height) {
        return diversify(x, z, width, height);
    }

    private int[] diversify(int x, int z, int width, int height) {
        int input[] = this.parent.getInts(x, z, width, height);
        int output[] = IntCache.getIntCache(width * height);
        EnumBiomeTypePermian type;
        for (int zOut = 0; zOut < height; zOut++) {
            for (int xOut = 0; xOut < width; xOut++) {
                int i = xOut + zOut * width;
                int center = input[i];
                initChunkSeed(xOut + x, zOut + z);
                if (nextInt(2) == 0) {
                    if (Biome.getBiome(center) == BiomePermianDesert.biome)
                        output[i] = DesertBiomes[nextInt(DesertBiomes.length)];
                    else if (Biome.getBiome(center) == BiomePermianAridLands.biome)
                        output[i] = AridBiomes[nextInt(AridBiomes.length)];
                    else if (Biome.getBiome(center) == BiomePermianGlossopterisColdSwampLand.biome)
                        output[i] = GlossopterisBiomes[nextInt(GlossopterisBiomes.length)];
                    else if (Biome.getBiome(center)  == BiomePermianLowlands.biome) {
                        int choice = LowlandsBiomes[nextInt(LowlandsBiomes.length)];
                        if (choice == PERMIAN_LOWLANDS_FOREST_ID) {
                            output[i] = LowlandsWoodsBiomes[nextInt(LowlandsWoodsBiomes.length)];
                        }
                        else {
                            output[i] = choice;
                        }
                    }
                    else if (Biome.getBiome(center)  == BiomePermianLowlandsForest.biome)
                        output[i] = LowlandsWoodsBiomes[nextInt(LowlandsWoodsBiomes.length)];
                    else if (Biome.getBiome(center) == BiomePermianHighlands.biome)
                        output[i] = HighlandsBiomes[nextInt(HighlandsBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}