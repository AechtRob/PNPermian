package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.BiomePermianLowlandsForest;

public class GenLayerPermianHummocks extends GenLayer {


    public Biome PERMIAN_ARID = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest"));
    public int PERMIAN_ARID_ID =  Biome.getIdForBiome(PERMIAN_ARID);

    public Biome PERMIAN_HUMMOCKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_hummocks"));
    public int PERMIAN_HUMMOCKS_ID =  Biome.getIdForBiome(PERMIAN_HUMMOCKS);

    private final int AridBiomes[] = new int[] {
            PERMIAN_ARID_ID,
            PERMIAN_ARID_ID,
            PERMIAN_ARID_ID,
            PERMIAN_HUMMOCKS_ID
    };

    public GenLayerPermianHummocks(long seed, GenLayer genlayer) {
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
                    if (Biome.getBiome(center) == BiomePermianLowlandsForest.biome)
                        output[i] = AridBiomes[nextInt(AridBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }


}