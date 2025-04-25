package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerPermianRiverBorder extends GenLayer
{

    public Biome PERMIAN_RIVER = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_river"));
    public int PERMIAN_RIVER_ID = Biome.getIdForBiome(PERMIAN_RIVER);
    
    public Biome PERMIAN_DRUMLIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_drumlin"));
    public int PERMIAN_DRUMLIN_ID = Biome.getIdForBiome(PERMIAN_DRUMLIN);

    public Biome PERMIAN_OCEAN_SHORE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_shore"));
    public int PERMIAN_OCEAN_SHORE_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_SHORE);
    public Biome PERMIAN_OCEAN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean"));
    public int PERMIAN_OCEAN_ID =  Biome.getIdForBiome(PERMIAN_OCEAN);
    public Biome PERMIAN_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach"));
    public int PERMIAN_BEACH_ID =  Biome.getIdForBiome(PERMIAN_BEACH);
    public Biome PERMIAN_SALTMARSH_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_beach_saltmarsh"));
    public int PERMIAN_SALTMARSH_BEACH_ID =  Biome.getIdForBiome(PERMIAN_SALTMARSH_BEACH);
    public Biome PERMIAN_GLOSSOPTERIS_BEACH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_beach"));
    public int PERMIAN_GLOSSOPTERIS_BEACH_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_BEACH);
    public Biome PERMIAN_REEF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_sponge_reef"));
    public int PERMIAN_REEF_ID =  Biome.getIdForBiome(PERMIAN_REEF);
    public Biome PERMIAN_OCEAN_CLIFF = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_ocean_cliff"));
    public int PERMIAN_OCEAN_CLIFF_ID =  Biome.getIdForBiome(PERMIAN_OCEAN_CLIFF);

    public Biome PERMIAN_DESERT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert"));
    public int PERMIAN_DESERT_ID =  Biome.getIdForBiome(PERMIAN_DESERT);

    public Biome PERMIAN_ARIDLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands"));
    public int PERMIAN_ARIDLANDS_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS);
    public Biome PERMIAN_ARIDLANDS_LUSH = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_lands_lush"));
    public int PERMIAN_ARIDLANDS_LUSH_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS_LUSH);
    public Biome PERMIAN_ARIDLANDS_HILLS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_arid_hills"));
    public int PERMIAN_ARIDLANDS_HILLS_ID =  Biome.getIdForBiome(PERMIAN_ARIDLANDS_HILLS);

    public Biome PERMIAN_FLOODBASALT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt"));
    public int PERMIAN_FLOODBASALT_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT);
    public Biome PERMIAN_FLOODBASALT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_floodbasalt_edge"));
    public int PERMIAN_FLOODBASALT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_FLOODBASALT_EDGE);
    public Biome PERMIAN_DESERT_EDGE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_desert_edge"));
    public int PERMIAN_DESERT_EDGE_ID =  Biome.getIdForBiome(PERMIAN_DESERT_EDGE);

    public Biome PERMIAN_HIGHLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_highlands"));
    public int PERMIAN_HIGHLANDS_ID =  Biome.getIdForBiome(PERMIAN_HIGHLANDS);
    public Biome PERMIAN_MOUNTAINS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_mountains"));
    public int PERMIAN_MOUNTAINS_ID =  Biome.getIdForBiome(PERMIAN_MOUNTAINS);

    public Biome PERMIAN_GLOSSOPTERIS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest"));
    public int PERMIAN_GLOSSOPTERIS_SWAMP1_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS);
    public Biome PERMIAN_GLOSSOPTERIS_SWAMP = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_swamp"));
    public int PERMIAN_GLOSSOPTERIS_SWAMP2_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_SWAMP);
    public Biome PERMIAN_GLOSSOPTERIS_LAKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_ocean"));
    public int PERMIAN_GLOSSOPTERIS_LAKES_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LAKES);
    public Biome PERMIAN_GLOSSOPTERIS_LIGHT = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_light"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_LIGHT);
    public Biome PERMIAN_GLOSSOPTERIS_CRAGGY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_cold_glossopteris_forest_craggy"));
    public int PERMIAN_GLOSSOPTERIS_CRAGGY_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_CRAGGY);
    public Biome PERMIAN_GLOSSOPTERIS_MEADOW = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_MEADOW);
    public Biome PERMIAN_GLOSSOPTERIS_COPSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_temperate_glossopteris_copse"));
    public int PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID =  Biome.getIdForBiome(PERMIAN_GLOSSOPTERIS_COPSE);

    public Biome PERMIAN_LOWLANDS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands"));
    public int PERMIAN_LOWLANDS_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS);
    public Biome PERMIAN_LOWLANDS_FOREST = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest"));
    public int PERMIAN_LOWLANDS_FOREST_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FOREST);
    public Biome PERMIAN_LOWLANDS_FOREST_DENSE = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_forest_dense"));
    public int PERMIAN_LOWLANDS_FOREST_DENSE_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FOREST_DENSE);
    public Biome PERMIAN_LOWLANDS_FLOODPLAIN = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain"));
    public int PERMIAN_LOWLANDS_FLOODPLAIN_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FLOODPLAIN);
    public Biome PERMIAN_LOWLANDS_FLOODPLAIN2 = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_lowlands_floodplain_lake"));
    public int PERMIAN_LOWLANDS_FLOODPLAIN2_ID =  Biome.getIdForBiome(PERMIAN_LOWLANDS_FLOODPLAIN2);

    public Biome PERMIAN_WETLANDS_BANK = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded_earthbanks"));
    public int PERMIAN_WETLANDS_BANK_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_BANK);
    public Biome PERMIAN_WETLANDS_UNWOODED = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_unwooded"));
    public int PERMIAN_WETLANDS_UNWOODED_ID =  Biome.getIdForBiome(PERMIAN_WETLANDS_UNWOODED);

    public Biome PERMIAN_HUMMOCKS = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_wetlands_hummocks"));
    public int PERMIAN_HUMMOCKS_ID =  Biome.getIdForBiome(PERMIAN_HUMMOCKS);

    public Biome PERMIAN_STONY = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_plains"));
    public int PERMIAN_STONY_ID =  Biome.getIdForBiome(PERMIAN_STONY);
    public Biome PERMIAN_STONY_SPIKES = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_plains_spikes"));
    public int PERMIAN_STONY_SPIKES_ID =  Biome.getIdForBiome(PERMIAN_STONY_SPIKES);
    public Biome PERMIAN_STONY_DEPRESSION = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression"));
    public int PERMIAN_STONY_DEPRESSION_ID =  Biome.getIdForBiome(PERMIAN_STONY_DEPRESSION);
    public Biome PERMIAN_STONY_DEPRESSION_RIM = Biome.REGISTRY.getObject(new ResourceLocation("lepidodendron:permian_stony_depression_rim"));
    public int PERMIAN_STONY_DEPRESSION_RIM_ID =  Biome.getIdForBiome(PERMIAN_STONY_DEPRESSION_RIM);

    public GenLayerPermianRiverBorder(long seed, GenLayer genLayer)
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

                if (isDesert(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isDesert(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforDesert(l1)))
                        || ((!isDesert(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforDesert(k2)))
                        || ((!isDesert(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforDesert(j3)))
                        || ((!isDesert(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforDesert(i4)))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isCathay(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isCathay(l1)) && (!isOceanOrBeach(l1)))
                            || ((!isCathay(k2)) && (!isOceanOrBeach(k2)))
                            || ((!isCathay(j3)) && (!isOceanOrBeach(j3)))
                            || ((!isCathay(i4)) && (!isOceanOrBeach(i4)))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGlossopterisCold(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];
                    if (((!isGlossopterisCold(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforGlossopterisCold(l1)))
                            || ((!isGlossopterisCold(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforGlossopterisCold(k2)))
                            || ((!isGlossopterisCold(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforGlossopterisCold(j3)))
                            || ((!isGlossopterisCold(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforGlossopterisCold(i4)))
                    ) {
                        aint1[j + i * areaWidth] = PERMIAN_DRUMLIN_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGlossopterisLakes(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];
                    if (((!isGlossopterisLakes(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforGlossopterisLakes(l1)))
                            || ((!isGlossopterisLakes(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforGlossopterisLakes(k2)))
                            || ((!isGlossopterisLakes(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforGlossopterisLakes(j3)))
                            || ((!isGlossopterisLakes(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforGlossopterisLakes(i4)))
                    ) {
                        aint1[j + i * areaWidth] = PERMIAN_DRUMLIN_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGlossopterisTemperate(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];
                    if (((!isGlossopterisTemperate(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforGlossopterisTemperate(l1)))
                            || ((!isGlossopterisTemperate(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforGlossopterisTemperate(k2)))
                            || ((!isGlossopterisTemperate(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforGlossopterisTemperate(j3)))
                            || ((!isGlossopterisTemperate(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforGlossopterisTemperate(i4)))
                    ) {
                        aint1[j + i * areaWidth] = PERMIAN_DRUMLIN_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isGlossopteris(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isGlossopteris(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforGlossopteris(l1)))
                        || ((!isGlossopteris(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforGlossopteris(k2)))
                        || ((!isGlossopteris(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforGlossopteris(j3)))
                        || ((!isGlossopteris(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforGlossopteris(i4)))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isArid(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isArid(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforArid(l1)))
                        || ((!isArid(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforArid(k2)))
                        || ((!isArid(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforArid(j3)))
                        || ((!isArid(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforArid(i4)))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
                    }
                    else
                    {
                        aint1[j + i * areaWidth] = k;
                    }
                }
                else if (isAridRussia(k))
                {
                    int l1 = aint[j + 1 + (i + 1 - 1) * (areaWidth + 2)];
                    int k2 = aint[j + 1 + 1 + (i + 1) * (areaWidth + 2)];
                    int j3 = aint[j + 1 - 1 + (i + 1) * (areaWidth + 2)];
                    int i4 = aint[j + 1 + (i + 1 + 1) * (areaWidth + 2)];

                    if (((!isAridRussia(l1)) && (!isOceanOrBeach(l1)) && (!isExemptforAridRussia(l1)))
                            || ((!isAridRussia(k2)) && (!isOceanOrBeach(k2)) && (!isExemptforAridRussia(k2)))
                            || ((!isAridRussia(j3)) && (!isOceanOrBeach(j3)) && (!isExemptforAridRussia(j3)))
                            || ((!isAridRussia(i4)) && (!isOceanOrBeach(i4)) && (!isExemptforAridRussia(i4)))
                    )
                    {
                        aint1[j + i * areaWidth] = PERMIAN_RIVER_ID;
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

    private boolean isOceanOrBeach(int biomeID) {
        if (biomeID == PERMIAN_OCEAN_ID || biomeID == PERMIAN_OCEAN_SHORE_ID
            || biomeID == PERMIAN_BEACH_ID || biomeID == PERMIAN_GLOSSOPTERIS_BEACH_ID
                || biomeID == PERMIAN_SALTMARSH_BEACH_ID || biomeID == PERMIAN_REEF_ID
                || biomeID == PERMIAN_OCEAN_CLIFF_ID) {
            return true;
        }
        return false;
    }

    private boolean isDesert(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
            || biomeID == PERMIAN_STONY_ID
            || biomeID == PERMIAN_STONY_SPIKES_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_RIM_ID
                || biomeID == PERMIAN_DESERT_EDGE_ID) {
            return true;
        }
        return false;
    }

    private boolean isAridRussia(int biomeID) {
        if (biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID) {
            return true;
        }
        return false;
    }

    private boolean isArid(int biomeID) {
        if (biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
            || biomeID == PERMIAN_STONY_ID
            || biomeID == PERMIAN_STONY_SPIKES_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_RIM_ID) {
            return true;
        }
        return false;
    }

    private boolean isCathay(int biomeID) {
        if (biomeID == PERMIAN_WETLANDS_UNWOODED_ID
                || biomeID == PERMIAN_WETLANDS_BANK_ID) {
            return true;
        }
        return false;
    }

    private boolean isGlossopteris(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_SWAMP1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_SWAMP2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
            || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforGlossopteris(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_SWAMP1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_SWAMP2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_LOWLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN2_ID
            || biomeID == PERMIAN_DRUMLIN_ID
            || biomeID == PERMIAN_DESERT_EDGE_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforDesert(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_DESERT_EDGE_ID
            || biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_STONY_ID
            || biomeID == PERMIAN_STONY_SPIKES_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_RIM_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID
                || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforArid(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_ARIDLANDS_ID
            || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
            || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_STONY_ID
            || biomeID == PERMIAN_STONY_SPIKES_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_ID
            || biomeID == PERMIAN_STONY_DEPRESSION_RIM_ID
            || biomeID == PERMIAN_DESERT_EDGE_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID
                || biomeID == PERMIAN_DRUMLIN_ID
        ) {
            return true;
        }
        return false;
    }

    private boolean isExemptforAridRussia(int biomeID) {
        if (biomeID == PERMIAN_DESERT_ID
                || biomeID == PERMIAN_FLOODBASALT_ID
                || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
                || biomeID == PERMIAN_ARIDLANDS_ID
                || biomeID == PERMIAN_ARIDLANDS_HILLS_ID
                || biomeID == PERMIAN_ARIDLANDS_LUSH_ID
                || biomeID == PERMIAN_HIGHLANDS_ID
                || biomeID == PERMIAN_STONY_ID
                || biomeID == PERMIAN_STONY_SPIKES_ID
                || biomeID == PERMIAN_STONY_DEPRESSION_ID
                || biomeID == PERMIAN_STONY_DEPRESSION_RIM_ID
                || biomeID == PERMIAN_DESERT_EDGE_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID
                || biomeID == PERMIAN_DRUMLIN_ID
        ) {
            return true;
        }
        return false;
    }

    private boolean isExemptforWetlands(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_SWAMP1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_SWAMP2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
            || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
            || biomeID == PERMIAN_FLOODBASALT_ID
            || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
            || biomeID == PERMIAN_HIGHLANDS_ID
            || biomeID == PERMIAN_MOUNTAINS_ID
            || biomeID == PERMIAN_LOWLANDS_ID
            || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN2_ID
            || biomeID == PERMIAN_DESERT_EDGE_ID) {
            return true;
        }
        return false;
    }




    private boolean isGlossopterisCold(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_SWAMP1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_SWAMP2_ID
                || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isGlossopterisLakes(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
                || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isGlossopterisTemperate(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
                || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforGlossopterisCold(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_SWAMP1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_SWAMP2_ID
                || biomeID == PERMIAN_FLOODBASALT_ID
                || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
                || biomeID == PERMIAN_HIGHLANDS_ID
                || biomeID == PERMIAN_MOUNTAINS_ID
                || biomeID == PERMIAN_DRUMLIN_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforGlossopterisLakes(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
                || biomeID == PERMIAN_FLOODBASALT_ID
                || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
                || biomeID == PERMIAN_HIGHLANDS_ID
                || biomeID == PERMIAN_MOUNTAINS_ID
                || biomeID == PERMIAN_LOWLANDS_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN2_ID
                || biomeID == PERMIAN_DRUMLIN_ID
                || biomeID == PERMIAN_DESERT_EDGE_ID) {
            return true;
        }
        return false;
    }

    private boolean isExemptforGlossopterisTemperate(int biomeID) {
        if (biomeID == PERMIAN_GLOSSOPTERIS_LAKES_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE1_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_CRAGGY_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE2_ID
                || biomeID == PERMIAN_GLOSSOPTERIS_TEMPERATE3_ID
                || biomeID == PERMIAN_FLOODBASALT_ID
                || biomeID == PERMIAN_FLOODBASALT_EDGE_ID
                || biomeID == PERMIAN_HIGHLANDS_ID
                || biomeID == PERMIAN_MOUNTAINS_ID
                || biomeID == PERMIAN_LOWLANDS_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN_ID
                || biomeID == PERMIAN_LOWLANDS_FLOODPLAIN2_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_ID
                || biomeID == PERMIAN_LOWLANDS_FOREST_DENSE_ID
                || biomeID == PERMIAN_HUMMOCKS_ID
                || biomeID == PERMIAN_DRUMLIN_ID
                || biomeID == PERMIAN_DESERT_EDGE_ID) {
            return true;
        }
        return false;
    }

}
