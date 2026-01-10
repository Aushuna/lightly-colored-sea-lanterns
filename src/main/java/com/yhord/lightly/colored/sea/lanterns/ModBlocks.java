package com.yhord.lightly.colored.sea.lanterns;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block WHITE_SEA_LANTERN = register("white_sea_lantern");
    public static final Block ORANGE_SEA_LANTERN = register("orange_sea_lantern");
    public static final Block MAGENTA_SEA_LANTERN = register("magenta_sea_lantern");
    public static final Block LIGHT_BLUE_SEA_LANTERN = register("light_blue_sea_lantern");
    public static final Block YELLOW_SEA_LANTERN = register("yellow_sea_lantern");
    public static final Block LIME_SEA_LANTERN = register("lime_sea_lantern");
    public static final Block PINK_SEA_LANTERN = register("pink_sea_lantern");
    public static final Block GRAY_SEA_LANTERN = register("gray_sea_lantern");
    public static final Block LIGHT_GRAY_SEA_LANTERN = register("light_gray_sea_lantern");
    public static final Block CYAN_SEA_LANTERN = register("cyan_sea_lantern");
    public static final Block PURPLE_SEA_LANTERN = register("purple_sea_lantern");
    public static final Block BLUE_SEA_LANTERN = register("blue_sea_lantern");
    public static final Block BROWN_SEA_LANTERN = register("brown_sea_lantern");
    public static final Block GREEN_SEA_LANTERN = register("green_sea_lantern");
    public static final Block RED_SEA_LANTERN = register("red_sea_lantern");
    public static final Block BLACK_SEA_LANTERN = register("black_sea_lantern");

    private static Block register(String id) {
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(LightlyColoredSeaLanterns.MOD_ID, id),
                new Block(Block.Settings.copy(Blocks.SEA_LANTERN))
        );
    }


    public static void registerBlocks() {
        // Intentionally empty: class loading triggers static registration above.
    }
}
