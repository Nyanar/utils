package mod.nyanar.utils.registry;

import mod.nyanar.utils.Utils;
import mod.nyanar.utils.blocks.OreBlockType;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Items;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegister {

    public static final Block LYNITE_ORE = new OreBlockType(Block.Settings.of(Material.STONE).strength(5.0F, 6.0F).lightLevel((blockStatex) -> 3));
    //public static final Block LYNITE_BLOCK = new Block(Block.Settings.of(Material.METAL).strength(5.0F, 6.0F));

    public static void register() {

        registerBlock("lynite_ore", LYNITE_ORE);

    }

    public static void registerBlock(String name, Block block) {

        Registry.register(Registry.BLOCK, new Identifier(Utils.MODID, name), block);

    }
}

