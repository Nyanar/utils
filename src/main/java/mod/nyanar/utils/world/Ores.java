package mod.nyanar.utils.world;

import mod.nyanar.utils.registry.BlockRegister;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import static mod.nyanar.utils.world.OreFeature.configuredOre;

public class Ores {
    public static ConfiguredFeature<?, ?>  ORE_LYNITE_OVERWORLD = configuredOre(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, BlockRegister.LYNITE_ORE, 8, 5, 22, 2);
    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("utils", "ore_lynite_overworld"), ORE_LYNITE_OVERWORLD);
    }
}
