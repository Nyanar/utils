package mod.nyanar.utils.world;

import mod.nyanar.utils.registry.BlockRegister;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

import static mod.nyanar.utils.world.OreFeature.ORE_LYNITE_OVERWORLD;

public class Ores {
    public static void register() {
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("utils", "ore_lynite_overworld"), ORE_LYNITE_OVERWORLD);
    }
}
