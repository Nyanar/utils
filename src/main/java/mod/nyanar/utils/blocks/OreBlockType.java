package mod.nyanar.utils.blocks;

import mod.nyanar.utils.registry.BlockRegister;
import net.minecraft.block.*;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class OreBlockType extends OreBlock {

    public OreBlockType(Settings settings) {
        super(settings);
    }

    protected int getExperienceWhenMined(Random random) {
        if (this == BlockRegister.LYNITE_ORE) {
            return MathHelper.nextInt(random, 3, 7);
        }
        else {
            return 0;
        }
    }
}
