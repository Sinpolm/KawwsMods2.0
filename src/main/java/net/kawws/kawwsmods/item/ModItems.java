package net.kawws.kawwsmods.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kawws.kawwsmods.KawwsMods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Register Items here
    public static final Item MONEY = registerItem("money", new Item(new Item.Settings()));
    // Add Items to Tabs Here
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ) {
        entries.add(MONEY);
    }
    //Register Method (Don't Register here)
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(KawwsMods.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        KawwsMods.LOGGER.info("Registering Mod Items for " + KawwsMods.MOD_ID);
    }
}
