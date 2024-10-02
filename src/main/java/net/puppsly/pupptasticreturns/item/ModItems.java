package net.puppsly.pupptasticreturns.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.puppsly.pupptasticreturns.PupptasticReturns;

public class ModItems {

    public static final Item SIREN_HEART = registerItem("siren_heart", new Item(new Item.Settings()));
    public static final Item RAW_ROSE_QUARTZ = registerItem("raw_rose_quartz", new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ_TOTEM = registerItem("rose_quartz_totem", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(PupptasticReturns.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PupptasticReturns.LOGGER.info("Registering Mod Items for " + PupptasticReturns.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SIREN_HEART);
            entries.add(RAW_ROSE_QUARTZ);
            entries.add(ROSE_QUARTZ);
            entries.add(ROSE_QUARTZ_TOTEM);
        });
    }
}
