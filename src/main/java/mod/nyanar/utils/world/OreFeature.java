package mod.nyanar.utils.world;

import mod.nyanar.utils.registry.BlockRegister;
import net.minecraft.block.Block;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreFeature {
    public static ConfiguredFeature<?, ?> configuredOre(RuleTest filler, Block block, int veinSize, int minY, int maxY, int count) {
        return Feature.ORE
                .configure(new OreFeatureConfig(
                        filler,
                        block.getDefaultState(),
                        veinSize)) // vein size
                .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                        0, // bottom offset
                        minY, // min y level
                        maxY))) // max y level
                .spreadHorizontally()
                .repeat(count); // number of veins per chunk
    }
}
