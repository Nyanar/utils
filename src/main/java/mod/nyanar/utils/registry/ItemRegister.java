package mod.nyanar.utils.registry;

import mod.nyanar.utils.Utils;
import mod.nyanar.utils.itemgroup.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegister {

    public static final Item LYNITE_DUST = new Item(new Item.Settings().group(ItemGroups.MAIN_GROUP));
    public static final BlockItem LYNITE_ORE = new BlockItem(BlockRegister.LYNITE_ORE, new Item.Settings().group(ItemGroups.MAIN_GROUP));

    public static void register() {

        registerItem("lynite_dust", LYNITE_DUST);
        registerBlockItem("lynite_ore", LYNITE_ORE);

    }


    public static void registerItem(String name, Item item) {

        Registry.register(Registry.ITEM, new Identifier(Utils.MODID, name), item);

    }

    public static void registerBlockItem(String name, BlockItem block_item) {

        Registry.register(Registry.ITEM, new Identifier(Utils.MODID, name), block_item);

    }







    public static Item register(Block block) {
        return register(new BlockItem(block, new Item.Settings()));
    }

    public static Item register(Block block, ItemGroup group) {
        return register(new BlockItem(block, (new Item.Settings()).group(group)));
    }

    public static Item register(BlockItem item) {
        return register((Block)item.getBlock(), (Item)item);
    }

    public static Item register(Block block, Item iem) {
        return register(Registry.BLOCK.getId(block), iem);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(id), item);
    }

    public static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return (Item)Registry.register(Registry.ITEM, id, item);
    }
}
