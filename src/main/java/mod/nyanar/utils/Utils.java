package mod.nyanar.utils;

import mod.nyanar.utils.registry.BlockRegister;
import mod.nyanar.utils.registry.ItemRegister;
import mod.nyanar.utils.world.Ores;
import net.fabricmc.api.ModInitializer;

public class Utils implements ModInitializer {

	public static final String MODID = "utils";

	@Override
	public void onInitialize() {

		ItemRegister.register();
		BlockRegister.register();
		Ores.register();

	}
}
