package com.yhord.lightly.colored.sea.lanterns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LightlyColoredSeaLanterns implements ModInitializer {

    public static final String MOD_ID = "lcsl";

    // Register the creative tab (item group) the modern 1.21.1 way
    public static final ItemGroup ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "general"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.lcsl.general"))
                    .icon(() -> new ItemStack(Items.SEA_LANTERN))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_SEA_LANTERN);
                        entries.add(ModBlocks.ORANGE_SEA_LANTERN);
                        entries.add(ModBlocks.MAGENTA_SEA_LANTERN);
                        entries.add(ModBlocks.LIGHT_BLUE_SEA_LANTERN);
                        entries.add(ModBlocks.YELLOW_SEA_LANTERN);
                        entries.add(ModBlocks.LIME_SEA_LANTERN);
                        entries.add(ModBlocks.PINK_SEA_LANTERN);
                        entries.add(ModBlocks.GRAY_SEA_LANTERN);
                        entries.add(ModBlocks.LIGHT_GRAY_SEA_LANTERN);
                        entries.add(ModBlocks.CYAN_SEA_LANTERN);
                        entries.add(ModBlocks.PURPLE_SEA_LANTERN);
                        entries.add(ModBlocks.BLUE_SEA_LANTERN);
                        entries.add(ModBlocks.BROWN_SEA_LANTERN);
                        entries.add(ModBlocks.GREEN_SEA_LANTERN);
                        entries.add(ModBlocks.RED_SEA_LANTERN);
                        entries.add(ModBlocks.BLACK_SEA_LANTERN);
                    })
                    .build()
    );

    @Override
    public void onInitialize() {
        // Register blocks first, then items (block-items depend on blocks existing)
        ModBlocks.registerBlocks();
        ModItems.registerItems();
    }
}

