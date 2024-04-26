package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.BiomePermianWetlands;
import net.pnpermian.world.biome.permian.BiomePermianWetlandsFernCopse;
import net.pnpermian.world.biome.permian.BiomePermianWetlandsUnwooded;

public class GenLayerPermianHummocks extends GenLayer {


    public Biome PERMIAN_WETLANDS_UNWOODED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public int PERMIAN_WETLANDS_UNWOODED_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_UNWOODED);
    public Biome PERMIAN_WETLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands"));
    public int PERMIAN_WETLANDS_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS);
    public Biome PERMIAN_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_fern_copse"));
    public int PERMIAN_COPSE_ID =  Biome.getIdForBiome(PERMIAN_COPSE);

    public Biome PERMIAN_HUMMOCKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_hummocks"));
    public int PERMIAN_HUMMOCKS_ID =  Biome.getIdForBiome(PERMIAN_HUMMOCKS);


    private final int UnwoodedWetlandsBiomes[] = new int[] {
            PERMIAN_WETLANDS_UNWOODED_ID,
            PERMIAN_WETLANDS_UNWOODED_ID,
            PERMIAN_WETLANDS_UNWOODED_ID,
            PERMIAN_HUMMOCKS_ID
    };

    private final int WoodedWetlandsBiomes[] = new int[] {
            PERMIAN_WETLANDS_ID,
            PERMIAN_WETLANDS_ID,
            PERMIAN_WETLANDS_ID,
            PERMIAN_HUMMOCKS_ID
    };

    private final int CopseBiomes[] = new int[] {
            PERMIAN_COPSE_ID,
            PERMIAN_COPSE_ID,
            PERMIAN_COPSE_ID,
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
                    if (Biome.getBiome(center) == BiomePermianWetlandsUnwooded.biome)
                        output[i] = UnwoodedWetlandsBiomes[nextInt(UnwoodedWetlandsBiomes.length)];
                    else if (Biome.getBiome(center) == BiomePermianWetlands.biome)
                        output[i] = WoodedWetlandsBiomes[nextInt(WoodedWetlandsBiomes.length)];
                    else if (Biome.getBiome(center) == BiomePermianWetlandsFernCopse.biome)
                        output[i] = CopseBiomes[nextInt(CopseBiomes.length)];
                    else output[i] = center;
                } else output[i] = center;
            }
        }
        return output;
    }


}