package mod.nyanar.utils.itemgroup;

import mod.nyanar.utils.registry.ItemRegister;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ItemGroups {

    public static final ItemGroup MAIN_GROUP = FabricItemGroupBuilder.create(
            new Identifier("utils", "main"))
            .icon(() -> new ItemStack(ItemRegister.LYNITE_DUST))
            .appendItems(stacks ->
            {
                stacks.add(new ItemStack(ItemRegister.LYNITE_DUST));
                stacks.add(new ItemStack(ItemRegister.LYNITE_ORE));
            })
            .build();
}
