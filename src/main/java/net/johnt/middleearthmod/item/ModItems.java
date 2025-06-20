package net.johnt.middleearthmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.johnt.middleearthmod.MiddleEarthMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MITHRIL_ORE = registerItem(new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MiddleEarthMod.MOD_ID,"mithril_ore")))));


    private static Item registerItem(Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MiddleEarthMod.MOD_ID, "mithril_ore"), item);
    }

    public static void registerModItems() {
        MiddleEarthMod.LOGGER.info("Registering Mod Items for" + MiddleEarthMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> fabricItemGroupEntries.add(MITHRIL_ORE));

    }
}
