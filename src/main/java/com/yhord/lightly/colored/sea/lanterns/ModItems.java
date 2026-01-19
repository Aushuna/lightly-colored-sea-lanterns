package com.yhord.lightly.colored.sea.lanterns;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final BlockItem WHITE_SEA_LANTERN =
            new BlockItem(ModBlocks.WHITE_SEA_LANTERN, new Item.Settings());
    public static final BlockItem ORANGE_SEA_LANTERN =
            new BlockItem(ModBlocks.ORANGE_SEA_LANTERN, new Item.Settings());
    public static final BlockItem MAGENTA_SEA_LANTERN =
            new BlockItem(ModBlocks.MAGENTA_SEA_LANTERN, new Item.Settings());
    public static final BlockItem LIGHT_BLUE_SEA_LANTERN =
            new BlockItem(ModBlocks.LIGHT_BLUE_SEA_LANTERN, new Item.Settings());
    public static final BlockItem YELLOW_SEA_LANTERN =
            new BlockItem(ModBlocks.YELLOW_SEA_LANTERN, new Item.Settings());
    public static final BlockItem LIME_SEA_LANTERN =
            new BlockItem(ModBlocks.LIME_SEA_LANTERN, new Item.Settings());
    public static final BlockItem PINK_SEA_LANTERN =
            new BlockItem(ModBlocks.PINK_SEA_LANTERN, new Item.Settings());
    public static final BlockItem GRAY_SEA_LANTERN =
            new BlockItem(ModBlocks.GRAY_SEA_LANTERN, new Item.Settings());
    public static final BlockItem LIGHT_GRAY_SEA_LANTERN =
            new BlockItem(ModBlocks.LIGHT_GRAY_SEA_LANTERN, new Item.Settings());
    public static final BlockItem CYAN_SEA_LANTERN =
            new BlockItem(ModBlocks.CYAN_SEA_LANTERN, new Item.Settings());
    public static final BlockItem PURPLE_SEA_LANTERN =
            new BlockItem(ModBlocks.PURPLE_SEA_LANTERN, new Item.Settings());
    public static final BlockItem BLUE_SEA_LANTERN =
            new BlockItem(ModBlocks.BLUE_SEA_LANTERN, new Item.Settings());
    public static final BlockItem BROWN_SEA_LANTERN =
            new BlockItem(ModBlocks.BROWN_SEA_LANTERN, new Item.Settings());
    public static final BlockItem GREEN_SEA_LANTERN =
            new BlockItem(ModBlocks.GREEN_SEA_LANTERN, new Item.Settings());
    public static final BlockItem RED_SEA_LANTERN =
            new BlockItem(ModBlocks.RED_SEA_LANTERN, new Item.Settings());
    public static final BlockItem BLACK_SEA_LANTERN =
            new BlockItem(ModBlocks.BLACK_SEA_LANTERN, new Item.Settings());

    public static void registerItems() {
        register("white_sea_lantern", WHITE_SEA_LANTERN);
        register("orange_sea_lantern", ORANGE_SEA_LANTERN);
        register("magenta_sea_lantern", MAGENTA_SEA_LANTERN);
        register("light_blue_sea_lantern", LIGHT_BLUE_SEA_LANTERN);
        register("yellow_sea_lantern", YELLOW_SEA_LANTERN);
        register("lime_sea_lantern", LIME_SEA_LANTERN);
        register("pink_sea_lantern", PINK_SEA_LANTERN);
        register("gray_sea_lantern", GRAY_SEA_LANTERN);
        register("light_gray_sea_lantern", LIGHT_GRAY_SEA_LANTERN);
        register("cyan_sea_lantern", CYAN_SEA_LANTERN);
        register("purple_sea_lantern", PURPLE_SEA_LANTERN);
        register("blue_sea_lantern", BLUE_SEA_LANTERN);
        register("brown_sea_lantern", BROWN_SEA_LANTERN);
        register("green_sea_lantern", GREEN_SEA_LANTERN);
        register("red_sea_lantern", RED_SEA_LANTERN);
        register("black_sea_lantern", BLACK_SEA_LANTERN);
    }

    private static void register(String name, BlockItem item) {
        Registry.register(
                Registries.ITEM,
                Identifier.of(LightlyColoredSeaLanterns.MOD_ID, name),
                item
        );
    }

}
