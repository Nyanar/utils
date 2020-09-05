package mod.nyanar.utils.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;
/*
Building 1
Brewing 2
Saved hotbars 3
Survival inventory 4
Decoration 5

*/
@Mixin(targets = "net/minecraft/item/ItemGroup$5")
public abstract class MixinDecorationGroup extends ItemGroup{

    public MixinDecorationGroup(int index, String id) {
        super(index, id);
        throw new UnsupportedOperationException("Mixin class not transformed!");
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendStacks(DefaultedList<ItemStack> stacks) {

        stacks.add(new ItemStack(Items.WHITE_WOOL));
        stacks.add(new ItemStack(Items.ORANGE_WOOL));
        stacks.add(new ItemStack(Items.MAGENTA_WOOL));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_WOOL));
        stacks.add(new ItemStack(Items.YELLOW_WOOL));
        stacks.add(new ItemStack(Items.LIME_WOOL));
        stacks.add(new ItemStack(Items.PINK_WOOL));
        stacks.add(new ItemStack(Items.GRAY_WOOL));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_WOOL));
        stacks.add(new ItemStack(Items.CYAN_WOOL));
        stacks.add(new ItemStack(Items.PURPLE_WOOL));
        stacks.add(new ItemStack(Items.BLUE_WOOL));
        stacks.add(new ItemStack(Items.BROWN_WOOL));
        stacks.add(new ItemStack(Items.GREEN_WOOL));
        stacks.add(new ItemStack(Items.RED_WOOL));
        stacks.add(new ItemStack(Items.BLACK_WOOL));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_CARPET));
        stacks.add(new ItemStack(Items.ORANGE_CARPET));
        stacks.add(new ItemStack(Items.MAGENTA_CARPET));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_CARPET));
        stacks.add(new ItemStack(Items.YELLOW_CARPET));
        stacks.add(new ItemStack(Items.LIME_CARPET));
        stacks.add(new ItemStack(Items.PINK_CARPET));
        stacks.add(new ItemStack(Items.GRAY_CARPET));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_CARPET));
        stacks.add(new ItemStack(Items.CYAN_CARPET));
        stacks.add(new ItemStack(Items.PURPLE_CARPET));
        stacks.add(new ItemStack(Items.BLUE_CARPET));
        stacks.add(new ItemStack(Items.BROWN_CARPET));
        stacks.add(new ItemStack(Items.GREEN_CARPET));
        stacks.add(new ItemStack(Items.RED_CARPET));
        stacks.add(new ItemStack(Items.BLACK_CARPET));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_TERRACOTTA));
        stacks.add(new ItemStack(Items.ORANGE_TERRACOTTA));
        stacks.add(new ItemStack(Items.MAGENTA_TERRACOTTA));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_TERRACOTTA));
        stacks.add(new ItemStack(Items.YELLOW_TERRACOTTA));
        stacks.add(new ItemStack(Items.LIME_TERRACOTTA));
        stacks.add(new ItemStack(Items.PINK_TERRACOTTA));
        stacks.add(new ItemStack(Items.GRAY_TERRACOTTA));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_TERRACOTTA));
        stacks.add(new ItemStack(Items.CYAN_TERRACOTTA));
        stacks.add(new ItemStack(Items.PURPLE_TERRACOTTA));
        stacks.add(new ItemStack(Items.BLUE_TERRACOTTA));
        stacks.add(new ItemStack(Items.BROWN_TERRACOTTA));
        stacks.add(new ItemStack(Items.GREEN_TERRACOTTA));
        stacks.add(new ItemStack(Items.RED_TERRACOTTA));
        stacks.add(new ItemStack(Items.BLACK_TERRACOTTA));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.ORANGE_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.MAGENTA_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.YELLOW_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.LIME_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.PINK_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.GRAY_GLAZED_TERRACOTTA));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.CYAN_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.PURPLE_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.BLUE_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.BROWN_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.GREEN_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.RED_GLAZED_TERRACOTTA));
        stacks.add(new ItemStack(Items.BLACK_GLAZED_TERRACOTTA));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_STAINED_GLASS));
        stacks.add(new ItemStack(Items.ORANGE_STAINED_GLASS));
        stacks.add(new ItemStack(Items.MAGENTA_STAINED_GLASS));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_STAINED_GLASS));
        stacks.add(new ItemStack(Items.YELLOW_STAINED_GLASS));
        stacks.add(new ItemStack(Items.LIME_STAINED_GLASS));
        stacks.add(new ItemStack(Items.PINK_STAINED_GLASS));
        stacks.add(new ItemStack(Items.GRAY_STAINED_GLASS));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_STAINED_GLASS));
        stacks.add(new ItemStack(Items.CYAN_STAINED_GLASS));
        stacks.add(new ItemStack(Items.PURPLE_STAINED_GLASS));
        stacks.add(new ItemStack(Items.BLUE_STAINED_GLASS));
        stacks.add(new ItemStack(Items.BROWN_STAINED_GLASS));
        stacks.add(new ItemStack(Items.GREEN_STAINED_GLASS));
        stacks.add(new ItemStack(Items.RED_STAINED_GLASS));
        stacks.add(new ItemStack(Items.BLACK_STAINED_GLASS));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.ORANGE_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.MAGENTA_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.YELLOW_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.LIME_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.PINK_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.GRAY_STAINED_GLASS_PANE));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.CYAN_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.PURPLE_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.BLUE_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.BROWN_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.GREEN_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.RED_STAINED_GLASS_PANE));
        stacks.add(new ItemStack(Items.BLACK_STAINED_GLASS_PANE));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.ORANGE_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.MAGENTA_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.YELLOW_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.LIME_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.PINK_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.GRAY_CONCRETE_POWDER));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.CYAN_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.PURPLE_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.BLUE_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.BROWN_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.GREEN_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.RED_CONCRETE_POWDER));
        stacks.add(new ItemStack(Items.BLACK_CONCRETE_POWDER));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.WHITE_CONCRETE));
        stacks.add(new ItemStack(Items.ORANGE_CONCRETE));
        stacks.add(new ItemStack(Items.MAGENTA_CONCRETE));
        stacks.add(new ItemStack(Items.LIGHT_BLUE_CONCRETE));
        stacks.add(new ItemStack(Items.YELLOW_CONCRETE));
        stacks.add(new ItemStack(Items.LIME_CONCRETE));
        stacks.add(new ItemStack(Items.PINK_CONCRETE));
        stacks.add(new ItemStack(Items.GRAY_CONCRETE));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.LIGHT_GRAY_CONCRETE));
        stacks.add(new ItemStack(Items.CYAN_CONCRETE));
        stacks.add(new ItemStack(Items.PURPLE_CONCRETE));
        stacks.add(new ItemStack(Items.BLUE_CONCRETE));
        stacks.add(new ItemStack(Items.BROWN_CONCRETE));
        stacks.add(new ItemStack(Items.GREEN_CONCRETE));
        stacks.add(new ItemStack(Items.RED_CONCRETE));
        stacks.add(new ItemStack(Items.BLACK_CONCRETE));
        stacks.add(ItemStack.EMPTY);
        //
    }

    @Environment(EnvType.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.CYAN_CONCRETE);
    }

}
