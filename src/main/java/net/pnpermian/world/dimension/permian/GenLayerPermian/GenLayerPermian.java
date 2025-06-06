package net.pnpermian.world.dimension.permian.GenLayerPermian;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.*;

public class GenLayerPermian {

    protected GenLayer parent;

    public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldType, String options) {

        GenLayer biomes = new GenLayerPermianBiomes(1L);
        biomes = new GenLayerFuzzyZoom(2000L, biomes);
        if (!LepidodendronConfig.doShrinkBiomes) {
            biomes = new GenLayerZoom(2001L, biomes);
        }
        biomes = new GenLayerDiversifyPermian(1000L, biomes);
        biomes = new GenLayerZoom(1000L, biomes);

        biomes = new GenLayerDiversifyPermian(1001L, biomes);
        biomes = new GenLayerPermianCathay(1225L, biomes);
        biomes = new GenLayerPermianOffshore(683L, biomes);
        biomes = new GenLayerZoom(1001L, biomes);

        biomes = new GenLayerDiversifyPermian2(1002L, biomes);
        biomes = new GenLayerPermianOffshore(684L, biomes);
        biomes = new GenLayerPermianDeepOcean(1100L, biomes);
        biomes = new GenLayerPermianShallowOcean(1300L, biomes);
        biomes = new GenLayerPermianTreefernCopse(209L, biomes);
        biomes = new GenLayerPermianSpongeReef(1975L, biomes);
        biomes = new GenLayerPermianStonyDepression(1812L, biomes);
        biomes = new GenLayerPermianPools(23L, biomes);
        biomes = new GenLayerPermianCirque(1313L, biomes);
        biomes = new GenLayerAridLandsLush(3426L, biomes);
        biomes = new GenLayerPermianAtoll(665L, biomes);
        biomes = new GenLayerZoom(1003L, biomes);

        biomes = new GenLayerPermianMountainEdge(2L, biomes);
        biomes = new GenLayerPermianAddGlossopterisCopse(1001L, biomes);
        biomes = new GenLayerPermianHummocks(283L, biomes);
        biomes = new GenLayerDesertEdge(12L, biomes);
        biomes = new GenLayerSmooth(700L, biomes);
        biomes = new GenLayerSmooth(701L, biomes);
        biomes = new GenLayerZoom(1004L, biomes);

        biomes = new GenLayerPermianGlossopterisCrags(133L, biomes);
        biomes = new GenLayerPermianFloodplainLakes(9305L, biomes);
        biomes = new GenLayerSmooth(703L, biomes);
        biomes = new GenLayerPermianAddGlossopterisCopse(1011L, biomes);
        biomes = new GenLayerPermianStonySpikesBig(1811L, biomes);
        biomes = new GenLayerDepressionTransition(425L, biomes);
        biomes = new GenLayerPermianAtollEdge(1250L, biomes);
        biomes = new GenLayerFuzzyZoom(1000L, biomes);

        biomes = new GenLayerPermianBeachMarsh(1150L, biomes);
        biomes = new GenLayerPermianBeach(1050L, biomes);
        biomes = new GenLayerPermianAtollEdge(2250L, biomes);
        biomes = new GenLayerPermianFloodplainLakes(9306L, biomes);
        biomes = new GenLayerPermianFloodplainLakes(9307L, biomes);
        biomes = new GenLayerPermianCirqueLakes(9306L, biomes);
        biomes = new GenLayerPermianCirqueLakes(9307L, biomes);
        biomes = new GenLayerPermianFloodBasaltEdge(3L, biomes);
        biomes = new GenLayerPermianCliff(1080L, biomes);
        biomes = new GenLayerDepressionTransition(725L, biomes);
        biomes = new GenLayerSmooth(705L, biomes);
        biomes = new GenLayerFuzzyZoom(1001L, biomes);

        biomes = new GenLayerPermianGlossopterisBeach(1150L, biomes);
        biomes = new GenLayerPermianRiverBorder(325L, biomes);
        biomes = new GenLayerDepressionTransition(1000L, biomes); //Second try
        biomes = new GenLayerSmooth(706L, biomes);
        biomes = new GenLayerFuzzyZoom(1002L, biomes);

        biomes = new GenLayerPermianRiverBorder(326L, biomes);
        biomes = new GenLayerPermianStonySpikes(1811L, biomes);
        biomes = new GenLayerPermianAtollEdge(3250L, biomes);
        biomes = new GenLayerPermianColdGlossopterisSwampSurface(1244L, biomes);
        biomes = new GenLayerZoom(1006L, biomes);

        biomes = new GenLayerPermianTryToJoinRiverToSea(1000L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1001L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1002L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1003L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1004L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1005L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1006L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1007L, biomes);
        biomes = new GenLayerPermianTryToJoinRiverToSea(1008L, biomes);

        //Build and superimpose creeks:
        GenLayer genlayercreek = new GenLayerRiverInit(100L, biomes);
        GenLayer genlayercreek2 = GenLayerZoom.magnify(1000L, genlayercreek, 2);
        GenLayer genlayercreek3 = GenLayerZoom.magnify(1000L, genlayercreek2, 2);
        GenLayer genlayercreek4 = GenLayerZoom.magnify(1000L, genlayercreek3, 2);
        GenLayer genlayercreek5 = GenLayerZoom.magnify(1000L, genlayercreek4, 1);
        GenLayer genlayercreek6 = new GenLayerRiver(1L, genlayercreek5);
        GenLayer genlayercreek7 = new GenLayerSmooth(1000L, genlayercreek6);
        GenLayer genlayercreekfinal = new GenLayerPermianRiverMix(100L, biomes, genlayercreek7);

        //Additional features:
        GenLayer genlayerdeltacreek = new GenLayerRiverInit(200L, biomes);
        GenLayer genlayerdeltacreek2 = GenLayerZoom.magnify(2000L, genlayerdeltacreek, 2);
        GenLayer genlayerdeltacreek3 = GenLayerZoom.magnify(2000L, genlayerdeltacreek2, 2);
        GenLayer genlayerdeltacreek4 = GenLayerZoom.magnify(2000L, genlayerdeltacreek3, 2);
        GenLayer genlayerdeltacreek5 = new GenLayerRiver(2L, genlayerdeltacreek4);
        GenLayer genlayerdeltacreek6 = new GenLayerSmooth(2000L, genlayerdeltacreek5);
        GenLayer genlayerdeltacreekfinal = new GenLayerPermianRiverMixDeltaSpecial(200L, genlayercreekfinal, genlayerdeltacreek6);

        GenLayer genlayerdeltacreekB = new GenLayerRiverInit(300L, biomes);
        GenLayer genlayerdeltacreekB2 = GenLayerZoom.magnify(3000L, genlayerdeltacreekB, 2);
        GenLayer genlayerdeltacreekB3 = GenLayerZoom.magnify(3000L, genlayerdeltacreekB2, 2);
        GenLayer genlayerdeltacreekB4 = GenLayerZoom.magnify(3000L, genlayerdeltacreekB3, 2);
        GenLayer genlayerdeltacreekB5 = new GenLayerRiver(3L, genlayerdeltacreekB4);
        GenLayer genlayerdeltacreekB6 = new GenLayerSmooth(3000L, genlayerdeltacreekB5);
        GenLayer genlayerdeltacreekBfinal = new GenLayerPermianRiverMixDeltaSpecial(300L, genlayerdeltacreekfinal, genlayerdeltacreekB6);


        GenLayer genlayervoronoizoom = new GenLayerVoronoiZoom(10L, genlayerdeltacreekBfinal);

        genlayercreekfinal.initWorldGenSeed(seed);
        genlayervoronoizoom.initWorldGenSeed(seed);
        biomes.initWorldGenSeed(seed);

        genlayervoronoizoom.initWorldGenSeed(seed);
        return (new GenLayer[] { genlayercreekfinal, genlayervoronoizoom, genlayercreekfinal });
    }

}