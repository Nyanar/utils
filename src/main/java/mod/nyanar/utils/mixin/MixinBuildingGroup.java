package mod.nyanar.utils.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.*;
import net.minecraft.util.collection.DefaultedList;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(targets = "net/minecraft/item/ItemGroup$1")
public abstract class MixinBuildingGroup extends ItemGroup {

    public MixinBuildingGroup(int index, String id) {
        super(index, id);
        throw new UnsupportedOperationException("Mixin class not transformed!");
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendStacks(DefaultedList<ItemStack> stacks) {
        stacks.add(new ItemStack(Items.STONE));
        stacks.add(new ItemStack(Items.STONE_STAIRS));
        stacks.add(new ItemStack(Items.STONE_SLAB));
        stacks.add(new ItemStack(Items.COBBLESTONE));
        stacks.add(new ItemStack(Items.COBBLESTONE_STAIRS));
        stacks.add(new ItemStack(Items.COBBLESTONE_SLAB));
        stacks.add(new ItemStack(Items.COBBLESTONE_WALL));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.GRANITE));
        stacks.add(new ItemStack(Items.GRANITE_STAIRS));
        stacks.add(new ItemStack(Items.GRANITE_SLAB));
        stacks.add(new ItemStack(Items.POLISHED_GRANITE));
        stacks.add(new ItemStack(Items.POLISHED_GRANITE_STAIRS));
        stacks.add(new ItemStack(Items.POLISHED_GRANITE_SLAB));
        stacks.add(new ItemStack(Items.GRANITE_WALL));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.DIORITE));
        stacks.add(new ItemStack(Items.DIORITE_STAIRS));
        stacks.add(new ItemStack(Items.DIORITE_SLAB));
        stacks.add(new ItemStack(Items.POLISHED_DIORITE));
        stacks.add(new ItemStack(Items.POLISHED_DIORITE_STAIRS));
        stacks.add(new ItemStack(Items.POLISHED_DIORITE_SLAB));
        stacks.add(new ItemStack(Items.DIORITE_WALL));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.ANDESITE));
        stacks.add(new ItemStack(Items.ANDESITE_STAIRS));
        stacks.add(new ItemStack(Items.ANDESITE_SLAB));
        stacks.add(new ItemStack(Items.POLISHED_ANDESITE));
        stacks.add(new ItemStack(Items.POLISHED_ANDESITE_STAIRS));
        stacks.add(new ItemStack(Items.POLISHED_ANDESITE_SLAB));
        stacks.add(new ItemStack(Items.ANDESITE_WALL));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.GRASS_BLOCK));
        stacks.add(new ItemStack(Items.DIRT));
        stacks.add(new ItemStack(Items.COARSE_DIRT));
        stacks.add(new ItemStack(Items.PODZOL));
        stacks.add(new ItemStack(Items.MYCELIUM));
        stacks.add(new ItemStack(Items.CRIMSON_NYLIUM));
        stacks.add(new ItemStack(Items.WARPED_NYLIUM));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.OAK_PLANKS));
        stacks.add(new ItemStack(Items.SPRUCE_PLANKS));
        stacks.add(new ItemStack(Items.BIRCH_PLANKS));
        stacks.add(new ItemStack(Items.JUNGLE_PLANKS));
        stacks.add(new ItemStack(Items.ACACIA_PLANKS));
        stacks.add(new ItemStack(Items.DARK_OAK_PLANKS));
        stacks.add(new ItemStack(Items.CRIMSON_PLANKS));
        stacks.add(new ItemStack(Items.WARPED_PLANKS));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.OAK_STAIRS));
        stacks.add(new ItemStack(Items.SPRUCE_STAIRS));
        stacks.add(new ItemStack(Items.BIRCH_STAIRS));
        stacks.add(new ItemStack(Items.JUNGLE_STAIRS));
        stacks.add(new ItemStack(Items.ACACIA_STAIRS));
        stacks.add(new ItemStack(Items.DARK_OAK_STAIRS));
        stacks.add(new ItemStack(Items.CRIMSON_STAIRS));
        stacks.add(new ItemStack(Items.WARPED_STAIRS));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.OAK_SLAB));
        stacks.add(new ItemStack(Items.SPRUCE_SLAB));
        stacks.add(new ItemStack(Items.BIRCH_SLAB));
        stacks.add(new ItemStack(Items.JUNGLE_SLAB));
        stacks.add(new ItemStack(Items.ACACIA_SLAB));
        stacks.add(new ItemStack(Items.DARK_OAK_SLAB));
        stacks.add(new ItemStack(Items.CRIMSON_SLAB));
        stacks.add(new ItemStack(Items.WARPED_SLAB));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.OAK_LOG));
        stacks.add(new ItemStack(Items.SPRUCE_LOG));
        stacks.add(new ItemStack(Items.BIRCH_LOG));
        stacks.add(new ItemStack(Items.JUNGLE_LOG));
        stacks.add(new ItemStack(Items.ACACIA_LOG));
        stacks.add(new ItemStack(Items.DARK_OAK_LOG));
        stacks.add(new ItemStack(Items.CRIMSON_STEM));
        stacks.add(new ItemStack(Items.WARPED_STEM));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.STRIPPED_OAK_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_SPRUCE_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_BIRCH_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_JUNGLE_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_ACACIA_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_DARK_OAK_LOG));
        stacks.add(new ItemStack(Items.STRIPPED_CRIMSON_STEM));
        stacks.add(new ItemStack(Items.STRIPPED_WARPED_STEM));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.STRIPPED_OAK_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_SPRUCE_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_BIRCH_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_JUNGLE_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_ACACIA_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_DARK_OAK_WOOD));
        stacks.add(new ItemStack(Items.STRIPPED_CRIMSON_HYPHAE));
        stacks.add(new ItemStack(Items.STRIPPED_WARPED_HYPHAE));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.OAK_WOOD));
        stacks.add(new ItemStack(Items.SPRUCE_WOOD));
        stacks.add(new ItemStack(Items.BIRCH_WOOD));
        stacks.add(new ItemStack(Items.JUNGLE_WOOD));
        stacks.add(new ItemStack(Items.ACACIA_WOOD));
        stacks.add(new ItemStack(Items.DARK_OAK_WOOD));
        stacks.add(new ItemStack(Items.CRIMSON_HYPHAE));
        stacks.add(new ItemStack(Items.WARPED_HYPHAE));
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.COAL_ORE));
        stacks.add(new ItemStack(Items.IRON_ORE));
        stacks.add(new ItemStack(Items.REDSTONE_ORE));
        stacks.add(new ItemStack(Items.LAPIS_ORE));
        stacks.add(new ItemStack(Items.GOLD_ORE));
        stacks.add(new ItemStack(Items.DIAMOND_ORE));
        stacks.add(new ItemStack(Items.EMERALD_ORE));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.COAL_BLOCK));
        stacks.add(new ItemStack(Items.IRON_BLOCK));
        stacks.add(new ItemStack(Items.REDSTONE_BLOCK));
        stacks.add(new ItemStack(Items.LAPIS_BLOCK));
        stacks.add(new ItemStack(Items.GOLD_BLOCK));
        stacks.add(new ItemStack(Items.DIAMOND_BLOCK));
        stacks.add(new ItemStack(Items.EMERALD_BLOCK));
        stacks.add(ItemStack.EMPTY);
        stacks.add(ItemStack.EMPTY);
        //
        stacks.add(new ItemStack(Items.SANDSTONE));
        stacks.add(new ItemStack(Items.SANDSTONE_STAIRS));
        stacks.add(new ItemStack(Items.SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.SMOOTH_SANDSTONE));
        stacks.add(new ItemStack(Items.SMOOTH_SANDSTONE_STAIRS));
        stacks.add(new ItemStack(Items.SMOOTH_SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.CUT_SANDSTONE));
        stacks.add(new ItemStack(Items.CUT_SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.CHISELED_SANDSTONE));
        //
        stacks.add(new ItemStack(Items.RED_SANDSTONE));
        stacks.add(new ItemStack(Items.RED_SANDSTONE_STAIRS));
        stacks.add(new ItemStack(Items.RED_SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.SMOOTH_RED_SANDSTONE));
        stacks.add(new ItemStack(Items.SMOOTH_RED_SANDSTONE_STAIRS));
        stacks.add(new ItemStack(Items.SMOOTH_RED_SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.CUT_RED_SANDSTONE));
        stacks.add(new ItemStack(Items.CUT_RED_SANDSTONE_SLAB));
        stacks.add(new ItemStack(Items.CHISELED_RED_SANDSTONE));
        //
        stacks.add(new ItemStack(Items.MOSSY_COBBLESTONE));
        stacks.add(new ItemStack(Items.MOSSY_COBBLESTONE_STAIRS));
        stacks.add(new ItemStack(Items.MOSSY_COBBLESTONE_SLAB));
        stacks.add(new ItemStack(Items.STONE_BRICKS));
        stacks.add(new ItemStack(Items.STONE_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.STONE_BRICK_SLAB));
        stacks.add(new ItemStack(Items.MOSSY_STONE_BRICKS));
        stacks.add(new ItemStack(Items.MOSSY_STONE_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.MOSSY_STONE_BRICK_SLAB));
        //
        stacks.add(new ItemStack(Items.SMOOTH_STONE));
        stacks.add(new ItemStack(Items.SMOOTH_STONE_SLAB));
        stacks.add(new ItemStack(Items.CRACKED_STONE_BRICKS));
        stacks.add(new ItemStack(Items.CHISELED_STONE_BRICKS));
        stacks.add(new ItemStack(Items.SAND));
        stacks.add(new ItemStack(Items.RED_SAND));
        stacks.add(new ItemStack(Items.GLASS));
        stacks.add(new ItemStack(Items.GRAVEL));
        stacks.add(new ItemStack(Items.BEDROCK));
        //
        stacks.add(new ItemStack(Items.BRICKS));
        stacks.add(new ItemStack(Items.BRICK_STAIRS));
        stacks.add(new ItemStack(Items.BRICK_SLAB));
        stacks.add(new ItemStack(Items.NETHER_BRICKS));
        stacks.add(new ItemStack(Items.NETHER_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.NETHER_BRICK_SLAB));
        stacks.add(new ItemStack(Items.RED_NETHER_BRICKS));
        stacks.add(new ItemStack(Items.RED_NETHER_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.RED_NETHER_BRICK_SLAB));
        //
        stacks.add(new ItemStack(Items.QUARTZ_BLOCK));
        stacks.add(new ItemStack(Items.QUARTZ_STAIRS));
        stacks.add(new ItemStack(Items.QUARTZ_SLAB));
        stacks.add(new ItemStack(Items.SMOOTH_QUARTZ));
        stacks.add(new ItemStack(Items.SMOOTH_QUARTZ_STAIRS));
        stacks.add(new ItemStack(Items.SMOOTH_QUARTZ_SLAB));
        stacks.add(new ItemStack(Items.QUARTZ_PILLAR));
        stacks.add(new ItemStack(Items.CHISELED_QUARTZ_BLOCK));
        //
        stacks.add(new ItemStack(Items.SPONGE));
        stacks.add(new ItemStack(Items.WET_SPONGE));
        stacks.add(new ItemStack(Items.BOOKSHELF));
        stacks.add(new ItemStack(Items.PETRIFIED_OAK_SLAB));
        stacks.add(new ItemStack(Items.PURPUR_SLAB));
        stacks.add(new ItemStack(Items.PRISMARINE_SLAB));
        stacks.add(new ItemStack(Items.PRISMARINE_BRICK_SLAB));
        stacks.add(new ItemStack(Items.DARK_PRISMARINE_SLAB));
        stacks.add(new ItemStack(Items.OBSIDIAN));
        stacks.add(new ItemStack(Items.PURPUR_BLOCK));
        stacks.add(new ItemStack(Items.PURPUR_PILLAR));
        stacks.add(new ItemStack(Items.PURPUR_STAIRS));
        stacks.add(new ItemStack(Items.DIAMOND_BLOCK));
        stacks.add(new ItemStack(Items.ICE));
        stacks.add(new ItemStack(Items.SNOW_BLOCK));
        stacks.add(new ItemStack(Items.CLAY));
        stacks.add(new ItemStack(Items.PUMPKIN));
        stacks.add(new ItemStack(Items.CARVED_PUMPKIN));
        stacks.add(new ItemStack(Items.NETHERRACK));
        stacks.add(new ItemStack(Items.SOUL_SAND));
        stacks.add(new ItemStack(Items.SOUL_SOIL));
        stacks.add(new ItemStack(Items.BASALT));
        stacks.add(new ItemStack(Items.POLISHED_BASALT));
        stacks.add(new ItemStack(Items.GLOWSTONE));
        stacks.add(new ItemStack(Items.JACK_O_LANTERN));
        stacks.add(new ItemStack(Items.MELON));
        stacks.add(new ItemStack(Items.END_STONE));
        stacks.add(new ItemStack(Items.END_STONE_BRICKS));
        stacks.add(new ItemStack(Items.SANDSTONE_STAIRS));
        stacks.add(new ItemStack(Items.HAY_BLOCK));
        stacks.add(new ItemStack(Items.TERRACOTTA));
        stacks.add(new ItemStack(Items.PACKED_ICE));
        stacks.add(new ItemStack(Items.PRISMARINE));
        stacks.add(new ItemStack(Items.PRISMARINE_BRICKS));
        stacks.add(new ItemStack(Items.DARK_PRISMARINE));
        stacks.add(new ItemStack(Items.PRISMARINE_STAIRS));
        stacks.add(new ItemStack(Items.PRISMARINE_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.DARK_PRISMARINE_STAIRS));
        stacks.add(new ItemStack(Items.SEA_LANTERN));
        stacks.add(new ItemStack(Items.MAGMA_BLOCK));
        stacks.add(new ItemStack(Items.NETHER_WART_BLOCK));
        stacks.add(new ItemStack(Items.WARPED_WART_BLOCK));
        stacks.add(new ItemStack(Items.BONE_BLOCK));
        stacks.add(new ItemStack(Items.DEAD_TUBE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.DEAD_BRAIN_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.DEAD_BUBBLE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.DEAD_FIRE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.DEAD_HORN_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.TUBE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.BRAIN_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.BUBBLE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.FIRE_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.HORN_CORAL_BLOCK));
        stacks.add(new ItemStack(Items.BLUE_ICE));
        stacks.add(new ItemStack(Items.END_STONE_BRICK_STAIRS));
        stacks.add(new ItemStack(Items.END_STONE_BRICK_SLAB));
        stacks.add(new ItemStack(Items.DRIED_KELP_BLOCK));
        stacks.add(new ItemStack(Items.NETHERITE_BLOCK));
        stacks.add(new ItemStack(Items.ANCIENT_DEBRIS));
        stacks.add(new ItemStack(Items.CRYING_OBSIDIAN));
    }

    /*@Environment(EnvType.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.DIAMOND);
    }*/
}
