package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianRiverMixDeltaSpecial extends GenLayer
{
    private final GenLayer biomePatternGeneratorChain;
    private final GenLayer riverPatternGeneratorChain;

    //Creeks to use:

    public Biome PERMIAN_DELTA = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain_brake"));
    public int PERMIAN_DELTA_ID =  Biome.getIdForBiome(PERMIAN_DELTA);

    public Biome PERMIAN_DELTA_CREEK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_lowlands_floodplain_brake"));
    public int PERMIAN_DELTA_CREEK_ID =  Biome.getIdForBiome(PERMIAN_DELTA_CREEK);

    public GenLayerPermianRiverMixDeltaSpecial(long p_i2129_1_, GenLayer p_i2129_3_, GenLayer p_i2129_4_)
    {
        super(p_i2129_1_);
        this.biomePatternGeneratorChain = p_i2129_3_;
        this.riverPatternGeneratorChain = p_i2129_4_;
    }

    public void initWorldGenSeed(long seed)
    {
        this.biomePatternGeneratorChain.initWorldGenSeed(seed);
        this.riverPatternGeneratorChain.initWorldGenSeed(seed);
        super.initWorldGenSeed(seed);
    }

    public int[] getInts(int areaX, int areaY, int areaWidth, int areaHeight)
    {
        int[] aint = this.biomePatternGeneratorChain.getInts(areaX, areaY, areaWidth, areaHeight);
        int[] aint1 = this.riverPatternGeneratorChain.getInts(areaX, areaY, areaWidth, areaHeight);
        int[] aint2 = IntCache.getIntCache(areaWidth * areaHeight);

        for (int i = 0; i < areaWidth * areaHeight; ++i)
        {
            if (aint1[i] == Biome.getIdForBiome(Biomes.RIVER))
            {
                if (aint[i] == PERMIAN_DELTA_ID
                )
                {
                    aint2[i] = PERMIAN_DELTA_CREEK_ID;
                }
                else {
                    aint2[i] = aint[i];
                }
            }
            else
            {
                aint2[i] = aint[i];
            }

        }

        return aint2;
    }
}
