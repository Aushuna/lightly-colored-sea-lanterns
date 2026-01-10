package com.yhord.lightly.colored.sea.lanterns;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item WHITE_SEA_LANTERN = register("white_sea_lantern", new BlockItem(ModBlocks.WHITE_SEA_LANTERN, new Item.Settings()));
    public static final Item ORANGE_SEA_LANTERN = register("orange_sea_lantern", new BlockItem(ModBlocks.ORANGE_SEA_LANTERN, new Item.Settings()));
    public static final Item MAGENTA_SEA_LANTERN = register("magenta_sea_lantern", new BlockItem(ModBlocks.MAGENTA_SEA_LANTERN, new Item.Settings()));
    public static final Item LIGHT_BLUE_SEA_LANTERN = register("light_blue_sea_lantern", new BlockItem(ModBlocks.LIGHT_BLUE_SEA_LANTERN, new Item.Settings()));
    public static final Item YELLOW_SEA_LANTERN = register("yellow_sea_lantern", new BlockItem(ModBlocks.YELLOW_SEA_LANTERN, new Item.Settings()));
    public static final Item LIME_SEA_LANTERN = register("lime_sea_lantern", new BlockItem(ModBlocks.LIME_SEA_LANTERN, new Item.Settings()));
    public static final Item PINK_SEA_LANTERN = register("pink_sea_lantern", new BlockItem(ModBlocks.PINK_SEA_LANTERN, new Item.Settings()));
    public static final Item GRAY_SEA_LANTERN = register("gray_sea_lantern", new BlockItem(ModBlocks.GRAY_SEA_LANTERN, new Item.Settings()));
    public static final Item LIGHT_GRAY_SEA_LANTERN = register("light_gray_sea_lantern", new BlockItem(ModBlocks.LIGHT_GRAY_SEA_LANTERN, new Item.Settings()));
    public static final Item CYAN_SEA_LANTERN = register("cyan_sea_lantern", new BlockItem(ModBlocks.CYAN_SEA_LANTERN, new Item.Settings()));
    public static final Item PURPLE_SEA_LANTERN = register("purple_sea_lantern", new BlockItem(ModBlocks.PURPLE_SEA_LANTERN, new Item.Settings()));
    public static final Item BLUE_SEA_LANTERN = register("blue_sea_lantern", new BlockItem(ModBlocks.BLUE_SEA_LANTERN, new Item.Settings()));
    public static final Item BROWN_SEA_LANTERN = register("brown_sea_lantern", new BlockItem(ModBlocks.BROWN_SEA_LANTERN, new Item.Settings()));
    public static final Item GREEN_SEA_LANTERN = register("green_sea_lantern", new BlockItem(ModBlocks.GREEN_SEA_LANTERN, new Item.Settings()));
    public static final Item RED_SEA_LANTERN = register("red_sea_lantern", new BlockItem(ModBlocks.RED_SEA_LANTERN, new Item.Settings()));
    public static final Item BLACK_SEA_LANTERN = register("black_sea_lantern", new BlockItem(ModBlocks.BLACK_SEA_LANTERN, new Item.Settings()));

    private static Item register(String id, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(LightlyColoredSeaLanterns.MOD_ID, id),
                item
        );
    }

    public static void registerItems() {
        // Intentionally empty: static init above does the registering.
    }
}
