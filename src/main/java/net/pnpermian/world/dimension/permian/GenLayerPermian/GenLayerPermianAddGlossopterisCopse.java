package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.BiomePermianGlossopterisTemperateWaterMeadow;

public class GenLayerPermianAddGlossopterisCopse extends GenLayer {

    public Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris"));
    public int PERMIAN_GLOSSOPTERIS_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public Biome PERMIAN_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris_copse"));
    public int PERMIAN_COPSE_ID =  Biome.getIdForBiome(PERMIAN_COPSE);

    private final int GlossopterisBiomes[] = new int[] {
        PERMIAN_COPSE_ID,
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_GLOSSOPTERIS_ID,
        PERMIAN_GLOSSOPTERIS_ID
    };

    public GenLayerPermianAddGlossopterisCopse(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomePermianGlossopterisTemperateWaterMeadow.biome) {
                        output[i] = GlossopterisBiomes[nextInt(GlossopterisBiomes.length)];
                    }
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }

}