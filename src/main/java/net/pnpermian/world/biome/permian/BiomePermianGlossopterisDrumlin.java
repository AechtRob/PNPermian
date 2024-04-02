
package net.pnpermian.world.biome.permian;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.util.EnumBiomeTypePermian;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.gen.*;
import net.minecraft.block.BlockBush;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BiomePermianGlossopterisDrumlin extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:permian_drumlin")
	public static final BiomeGenCustom biome = null;
	public BiomePermianGlossopterisDrumlin(ElementsLepidodendronMod instance) {
		super(instance, 1589);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.HILLS);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.COLD);
	}

	static class BiomeGenCustom extends BiomePermian {
		public BiomeGenCustom() {
			super(new BiomeProperties("Permian Drumlin").setBaseHeight(0.325F).setHeightVariation(0.01F).setTemperature(0.2F).setRainfall(0.3F).setWaterColor(-5317633));
			setRegistryName("lepidodendron:permian_drumlin");
			topBlock = Blocks.GRAVEL.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.treesPerChunk = -999;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 20;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public void genTerrainBlocks(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal)
		{
			this.topBlock = Blocks.DIRT.getStateFromMeta(1);
			this.fillerBlock = Blocks.STONE.getStateFromMeta(0);

			if ((noiseVal < -1.0D || noiseVal > 2.0D))
			{
				this.topBlock = Blocks.GRAVEL.getDefaultState();
				this.fillerBlock = Blocks.GRAVEL.getDefaultState();
			}

			this.generateBiomeTerrain(worldIn, rand, chunkPrimerIn, x, z, noiseVal);
		}

		protected static final WorldGenNullTree NULL_TREE = new WorldGenNullTree(false);
		//protected static final WorldGenSphenophyllalesShrubby SPHENOPHYLLALES_SHRUBBY = new WorldGenSphenophyllalesShrubby();
		protected static final WorldGenGlossopterisBush GLOSSOPTERIS_BUSH_GENERATOR = new WorldGenGlossopterisBush();
		protected static final WorldGenSinglePlantOptionalWater PLANT_GENERATOR = new WorldGenSinglePlantOptionalWater();

		public WorldGenAbstractTree getRandomTreeFeature(Random rand)
		{
			return NULL_TREE;
		}

		@Override
	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {

			if (net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
			{
				int k = rand.nextInt(16) + 8;
				int l = rand.nextInt(16) + 8;
				BlockPos blockpos = worldIn.getHeight(pos.add(k, 0, l));
				GLOSSOPTERIS_BUSH_GENERATOR.generate(worldIn, rand, blockpos);
			}

			if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, new net.minecraft.util.math.ChunkPos(pos), net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
				for (int i = 0; i < 156; ++i)
				{
					int j = rand.nextInt(16) + 8;
					int k = rand.nextInt(16) + 8;
					int l = rand.nextInt(worldIn.getHeight(pos.add(j, 0, k)).getY() + 32);
					PLANT_GENERATOR.generate(BlockSphenophyllales2.block.getDefaultState(), worldIn, rand, pos.add(j, l, k));
				}


			super.decorate(worldIn, rand, pos);
	    }

		@Override
		public EnumBiomeTypePermian getBiomeType() {
			return EnumBiomeTypePermian.Glossopteris;
		}

	}
}
