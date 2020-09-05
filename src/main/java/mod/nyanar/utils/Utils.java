package mod.nyanar.utils;

import mod.nyanar.utils.registry.BlockRegister;
import mod.nyanar.utils.registry.ItemRegister;
import mod.nyanar.utils.world.Ores;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Utils implements ModInitializer {

	public static final String MODID = "utils";
	public static ConfiguredFeature<?, ?> ORE_WOOL_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					Blocks.WHITE_WOOL.getDefaultState(),
					9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0, // bottom offset
					0, // min y level
					64))) // max y level
			.spreadHorizontally()
			.repeat(20); // number of veins per chunk

	@Override
	public void onInitialize() {

		ItemRegister.register();
		BlockRegister.register();
		Ores.register();
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("tutorial", "ore_wool_overworld"), ORE_WOOL_OVERWORLD);

	}
}
