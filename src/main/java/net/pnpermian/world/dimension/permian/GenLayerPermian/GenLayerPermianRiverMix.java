package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianRiverMix extends GenLayer
{
    private final GenLayer biomePatternGeneratorChain;
    private final GenLayer riverPatternGeneratorChain;

    public Biome PERMIAN_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_river"));
    public int PERMIAN_RIVER_ID = Biome.getIdForBiome(PERMIAN_RIVER);

    //Creeks to use:
    public Biome PERMIAN_CREEK_ARID = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_arid"));
    public int PERMIAN_CREEK_ARID_ID = Biome.getIdForBiome(PERMIAN_CREEK_ARID);
    public Biome PERMIAN_CREEK_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_cold_glossopteris"));
    public int PERMIAN_CREEK_GLOSSOPTERIS_ID = Biome.getIdForBiome(PERMIAN_CREEK_GLOSSOPTERIS);
    public Biome PERMIAN_CREEK_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_desert"));
    public int PERMIAN_CREEK_DESERT_ID = Biome.getIdForBiome(PERMIAN_CREEK_DESERT);
    public Biome PERMIAN_CREEK_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_highlands"));
    public int PERMIAN_CREEK_HIGHLANDS_ID = Biome.getIdForBiome(PERMIAN_CREEK_HIGHLANDS);
    public Biome PERMIAN_CREEK_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_lowlands"));
    public int PERMIAN_CREEK_LOWLANDS_ID = Biome.getIdForBiome(PERMIAN_CREEK_LOWLANDS);
    public Biome PERMIAN_CREEK_WETLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_wetlands"));
    public int PERMIAN_CREEK_WETLANDS_ID = Biome.getIdForBiome(PERMIAN_CREEK_WETLANDS);
    public Biome PERMIAN_CREEK_COAST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_coastal"));
    public int PERMIAN_CREEK_COAST_ID = Biome.getIdForBiome(PERMIAN_CREEK_COAST);

    //Biomes to exclude for rivers:
    public Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public  int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public Biome PERMIAN_SPONGE_REEF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_sponge_reef"));
    public  int PERMIAN_SPONGE_REEF_ID =  Biome.getIdForBiome(PERMIAN_SPONGE_REEF);
    public Biome PERMIAN_OCEAN_CLIFF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_cliff"));
    public  int PERMIAN_OCEAN_CLIFF_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_CLIFF);
    public  Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public  int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);
    public  Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public  int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public  Biome PERMIAN_FLOODBASALT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt_edge"));
    public  int PERMIAN_FLOODBASALT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT_EDGE);

    public GenLayerPermianRiverMix(long p_i2129_1_, GenLayer p_i2129_3_, GenLayer p_i2129_4_)
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
                //Exclude rivers here:
                if (aint[i] == PERMIAN_OCEAN_SHORE_ID
                        || aint[i] == PERMIAN_OCEAN_ID
                        || aint[i] == PERMIAN_SPONGE_REEF_ID
                        || aint[i] == PERMIAN_OCEAN_CLIFF_ID
                        || aint[i] == PERMIAN_MOUNTAINS_ID
                        || aint[i] == PERMIAN_FLOODBASALT_ID
                        || aint[i] == PERMIAN_FLOODBASALT_EDGE_ID
                )
                {
                    aint2[i] = aint[i];
                }
                else {
                    //Add the rivers we want:
                    Biome biome = Biome.getBiome(aint[i]);
                    if (biome instanceof BiomePermian) {
                        BiomePermian biomePermian = (BiomePermian) biome;
                        if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Arid) {
                            aint2[i] = PERMIAN_CREEK_ARID_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Lowlands
                            || biomePermian.getBiomeType() == EnumBiomeTypePermian.Forest) {
                            aint2[i] = PERMIAN_CREEK_LOWLANDS_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Highlands) {
                            aint2[i] = PERMIAN_CREEK_HIGHLANDS_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Wetlands) {
                            aint2[i] = PERMIAN_CREEK_WETLANDS_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Desert) {
                            aint2[i] = PERMIAN_CREEK_DESERT_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
                            aint2[i] = PERMIAN_CREEK_GLOSSOPTERIS_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean) {
                            aint2[i] = PERMIAN_CREEK_COAST_ID;
                        }
                        else {
                            aint2[i] = PERMIAN_RIVER_ID;
                        }
                    }
                    else {
                        aint2[i] = PERMIAN_RIVER_ID;
                    }
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
