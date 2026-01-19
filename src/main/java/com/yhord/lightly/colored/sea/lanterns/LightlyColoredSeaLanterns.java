package com.yhord.lightly.colored.sea.lanterns;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class LightlyColoredSeaLanterns implements ModInitializer {

    public static final String MOD_ID = "lcsl";

    public static final RegistryKey<ItemGroup> ITEM_GROUP_KEY =
            RegistryKey.of(
                    Registries.ITEM_GROUP.getKey(),
                    Identifier.of(MOD_ID, "general")
            );

    @Override
    public void onInitialize() {

        Registry.register(
                Registries.ITEM_GROUP,
                ITEM_GROUP_KEY,
                FabricItemGroup.builder()
                        .icon(() -> new ItemStack(Items.SEA_LANTERN))
                        .displayName(Text.translatable("itemGroup.lcsl"))
                        .build()
        );

        ModBlocks.registerBlocks();
        ModItems.registerItems();

        ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(entries -> {
            entries.add(ModItems.WHITE_SEA_LANTERN);
            entries.add(ModItems.ORANGE_SEA_LANTERN);
            entries.add(ModItems.MAGENTA_SEA_LANTERN);
            entries.add(ModItems.LIGHT_BLUE_SEA_LANTERN);
            entries.add(ModItems.YELLOW_SEA_LANTERN);
            entries.add(ModItems.LIME_SEA_LANTERN);
            entries.add(ModItems.PINK_SEA_LANTERN);
            entries.add(ModItems.GRAY_SEA_LANTERN);
            entries.add(ModItems.LIGHT_GRAY_SEA_LANTERN);
            entries.add(ModItems.CYAN_SEA_LANTERN);
            entries.add(ModItems.PURPLE_SEA_LANTERN);
            entries.add(ModItems.BLUE_SEA_LANTERN);
            entries.add(ModItems.BROWN_SEA_LANTERN);
            entries.add(ModItems.GREEN_SEA_LANTERN);
            entries.add(ModItems.RED_SEA_LANTERN);
            entries.add(ModItems.BLACK_SEA_LANTERN);
        });
    }
}
