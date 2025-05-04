package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.pnpermian.world.biome.permian.*;

public class GenLayerPermianRiverMix extends GenLayer
{
    private final GenLayer biomePatternGeneratorChain;
    private final GenLayer riverPatternGeneratorChain;

    public Biome PERMIAN_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_river"));
    public int PERMIAN_RIVER_ID = Biome.getIdForBiome(PERMIAN_RIVER);

    //Creeks to use:
    public Biome PERMIAN_CREEK_ARID = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_arid"));
    public int PERMIAN_CREEK_ARID_ID = Biome.getIdForBiome(PERMIAN_CREEK_ARID);
    public Biome PERMIAN_CREEK_SCRUB = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_lowlands_forest"));
    public int PERMIAN_CREEK_SCRUB_ID = Biome.getIdForBiome(PERMIAN_CREEK_SCRUB);
    public Biome PERMIAN_CREEK_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_cold_glossopteris"));
    public int PERMIAN_CREEK_GLOSSOPTERIS_ID = Biome.getIdForBiome(PERMIAN_CREEK_GLOSSOPTERIS);
    public Biome PERMIAN_CREEK_GLOSSOPTERIS_COLD = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_cold_glossopteris_foggy"));
    public int PERMIAN_CREEK_GLOSSOPTERIS_COLD_ID = Biome.getIdForBiome(PERMIAN_CREEK_GLOSSOPTERIS_COLD);
    public Biome PERMIAN_CREEK_GLOSSOPTERIS_WATERMEADOW = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_temperate_glossopteris"));
    public int PERMIAN_CREEK_GLOSSOPTERIS_WATERMEADOW_ID = Biome.getIdForBiome(PERMIAN_CREEK_GLOSSOPTERIS_WATERMEADOW);
    public Biome PERMIAN_CREEK_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_desert"));
    public int PERMIAN_CREEK_DESERT_ID = Biome.getIdForBiome(PERMIAN_CREEK_DESERT);
    public Biome PERMIAN_CREEK_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_highlands"));
    public int PERMIAN_CREEK_HIGHLANDS_ID = Biome.getIdForBiome(PERMIAN_CREEK_HIGHLANDS);
    public Biome PERMIAN_CREEK_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_lowlands"));
    public int PERMIAN_CREEK_LOWLANDS_ID = Biome.getIdForBiome(PERMIAN_CREEK_LOWLANDS);
    public Biome PERMIAN_CREEK_LOWLANDS_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_lowlands_floodplain"));
    public int PERMIAN_CREEK_LOWLANDS_FLOODPLAIN_ID = Biome.getIdForBiome(PERMIAN_CREEK_LOWLANDS_FLOODPLAIN);
    public Biome PERMIAN_CREEK_COAST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_coastal"));
    public int PERMIAN_CREEK_COAST_ID = Biome.getIdForBiome(PERMIAN_CREEK_COAST);
    public Biome PERMIAN_CREEK_STONY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_creek_stony"));
    public int PERMIAN_CREEK_STONY_ID = Biome.getIdForBiome(PERMIAN_CREEK_STONY);

    //Biomes to exclude for rivers:
    public Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public Biome PERMIAN_SPONGE_REEF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_sponge_reef"));
    public int PERMIAN_SPONGE_REEF_ID =  Biome.getIdForBiome(PERMIAN_SPONGE_REEF);
    public Biome PERMIAN_OCEAN_CLIFF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_cliff"));
    public int PERMIAN_OCEAN_CLIFF_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_CLIFF);
    public Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);
    public Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public Biome PERMIAN_FLOODBASALT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt_edge"));
    public int PERMIAN_FLOODBASALT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT_EDGE);
    public Biome PERMIAN_STONY_DEPRESSION = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression"));
    public int PERMIAN_STONY_DEPRESSION_ID =  Biome.getIdForBiome(PERMIAN_STONY_DEPRESSION);
    public Biome PERMIAN_STONY_DEPRESSION_RIM = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression_rim"));
    public int PERMIAN_STONY_DEPRESSION_RIM_ID =  Biome.getIdForBiome(PERMIAN_STONY_DEPRESSION_RIM);
    public Biome PERMIAN_GLOSSOPTERIS_LAKE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_ocean"));
    public int PERMIAN_GLOSSOPTERIS_LAKE_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LAKE);
    public Biome PERMIAN_CATHAY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public int PERMIAN_CATHAY_ID =  Biome.getIdForBiome(PERMIAN_CATHAY);
    public Biome PERMIAN_CATHAY_EARTHBANKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded_earthbanks"));
    public int PERMIAN_CATHAY_EARTHBANKS_ID =  Biome.getIdForBiome(PERMIAN_CATHAY_EARTHBANKS);
    public Biome PERMIAN_SALTMARSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach_saltmarsh"));
    public int PERMIAN_SALTMARSH_ID =  Biome.getIdForBiome(PERMIAN_SALTMARSH);
    public Biome PERMIAN_ATOLL_RIM = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wooded_atoll_rim"));
    public int PERMIAN_ATOLL_RIM_ID =  Biome.getIdForBiome(PERMIAN_ATOLL_RIM);
    public Biome PERMIAN_ATOLL = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wooded_atoll"));
    public int PERMIAN_ATOLL_ID =  Biome.getIdForBiome(PERMIAN_ATOLL);

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
                        || aint[i] == PERMIAN_STONY_DEPRESSION_ID
                        || aint[i] == PERMIAN_STONY_DEPRESSION_RIM_ID
                        || aint[i] == PERMIAN_GLOSSOPTERIS_LAKE_ID
                        || aint[i] == PERMIAN_CATHAY_ID
                        || aint[i] == PERMIAN_CATHAY_EARTHBANKS_ID
                        || aint[i] == PERMIAN_SALTMARSH_ID
                        || aint[i] == PERMIAN_ATOLL_ID
                        || aint[i] == PERMIAN_ATOLL_RIM_ID
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
                            if (biome == BiomePermianStonyPlains.biome
                                || biome == BiomePermianStonyPlainsSpikes.biome) {
                                aint2[i] = PERMIAN_CREEK_STONY_ID;
                            }
                            else {
                                aint2[i] = PERMIAN_CREEK_ARID_ID;
                            }
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Lowlands) {
                            if (biome == BiomePermianLowlands.biome) {
                                aint2[i] = PERMIAN_CREEK_LOWLANDS_ID;
                            }
                            else {
                                aint2[i] = PERMIAN_CREEK_LOWLANDS_FLOODPLAIN_ID;
                            }
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Forest) {
                            aint2[i] = PERMIAN_CREEK_SCRUB_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Highlands) {
                            aint2[i] = PERMIAN_CREEK_HIGHLANDS_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Desert) {
                            aint2[i] = PERMIAN_CREEK_DESERT_ID;
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Glossopteris) {
                            if (biome == BiomePermianGlossopterisColdSwamp.biome || biome == BiomePermianGlossopterisColdSwampLand.biome) {
                                aint2[i] = PERMIAN_CREEK_GLOSSOPTERIS_COLD_ID;
                            }
                            else if (biome == BiomePermianGlossopterisTemperateForest.biome || biome == BiomePermianGlossopterisTemperateForestCraggy.biome) {
                                aint2[i] = PERMIAN_CREEK_GLOSSOPTERIS_ID;
                            }
                            else {
                                aint2[i] = PERMIAN_CREEK_GLOSSOPTERIS_WATERMEADOW_ID;
                            }
                        }
                        else if (biomePermian.getBiomeType() == EnumBiomeTypePermian.Ocean) {
                            aint2[i] = PERMIAN_CREEK_COAST_ID;
                        }
                        else {
                            aint2[i] = PERMIAN_RIVER_ID;
                        }
                    }
                    else {
                        aint2[i] = aint[i];
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
