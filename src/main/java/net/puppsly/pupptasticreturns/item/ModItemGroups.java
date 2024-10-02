package net.puppsly.pupptasticreturns.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.puppsly.pupptasticreturns.PupptasticReturns;
import net.puppsly.pupptasticreturns.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PUPPTASTIC_MOD_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PupptasticReturns.MOD_ID, "pupptastic_returns_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SIREN_HEART))
                    .displayName(Text.translatable("itemgroup.pupptasticreturns.pupptastic_returns_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SIREN_HEART);
                        entries.add(ModItems.RAW_ROSE_QUARTZ);
                        entries.add(ModItems.ROSE_QUARTZ);
                        entries.add(ModItems.ROSE_QUARTZ_TOTEM);
                    }).build());


    public static final ItemGroup PUPPTASTIC_MOD_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PupptasticReturns.MOD_ID, "pupptastic_returns_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.ROSE_QUARTZ_BLOCK))
                    .displayName(Text.translatable("itemgroup.pupptasticreturns.pupptastic_returns_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
                        entries.add(ModBlocks.ROSE_QUARTZ_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE);
                        entries.add(ModBlocks.NETHERRACK_ROSE_QUARTZ_ORE);
                    }).build());


    public static void registerItemGroups(){
        PupptasticReturns.LOGGER.info("Registering Item Groups for "+ PupptasticReturns.MOD_ID);
    }
}
