package com.yhord.lightly.colored.sea.lanterns;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block createLantern(MapColor color) {
        return new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN)
                .mapColor(color)
                .luminance(15)
                .sounds(BlockSoundGroup.GLASS));
    }

    public static final Block WHITE_SEA_LANTERN = createLantern(MapColor.WHITE);
    public static final Block ORANGE_SEA_LANTERN = createLantern(MapColor.ORANGE);
    public static final Block MAGENTA_SEA_LANTERN = createLantern(MapColor.MAGENTA);
    public static final Block LIGHT_BLUE_SEA_LANTERN = createLantern(MapColor.LIGHT_BLUE);
    public static final Block YELLOW_SEA_LANTERN = createLantern(MapColor.YELLOW);
    public static final Block LIME_SEA_LANTERN = createLantern(MapColor.LIME);
    public static final Block PINK_SEA_LANTERN = createLantern(MapColor.PINK);
    public static final Block GRAY_SEA_LANTERN = createLantern(MapColor.GRAY);
    public static final Block LIGHT_GRAY_SEA_LANTERN = createLantern(MapColor.LIGHT_GRAY);
    public static final Block CYAN_SEA_LANTERN = createLantern(MapColor.CYAN);
    public static final Block PURPLE_SEA_LANTERN = createLantern(MapColor.PURPLE);
    public static final Block BLUE_SEA_LANTERN = createLantern(MapColor.BLUE);
    public static final Block BROWN_SEA_LANTERN = createLantern(MapColor.BROWN);
    public static final Block GREEN_SEA_LANTERN = createLantern(MapColor.GREEN);
    public static final Block RED_SEA_LANTERN = createLantern(MapColor.RED);
    public static final Block BLACK_SEA_LANTERN = createLantern(MapColor.BLACK);

    public static void registerBlocks() {
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

    private static void register(String name, Block block) {
        Registry.register(
                Registries.BLOCK,
                Identifier.of(LightlyColoredSeaLanterns.MOD_ID, name),
                block
        );
    }

}
