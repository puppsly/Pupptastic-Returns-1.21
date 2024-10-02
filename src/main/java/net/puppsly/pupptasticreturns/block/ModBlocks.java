package net.puppsly.pupptasticreturns.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.puppsly.pupptasticreturns.PupptasticReturns;

public class ModBlocks {
    public static final Block ROSE_QUARTZ_BLOCK = registerBlock("rose_quartz_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f)
                            .requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_ROSE_QUARTZ_ORE = registerBlock("deepslate_rose_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f)
                            .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block NETHERRACK_ROSE_QUARTZ_ORE = registerBlock("netherrack_rose_quartz_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(2f)
                            .requiresTool().sounds(BlockSoundGroup.NETHERRACK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(PupptasticReturns.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(PupptasticReturns.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        PupptasticReturns.LOGGER.info("Registering Mod Blocks for " + PupptasticReturns.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
            entries.add(ModBlocks.ROSE_QUARTZ_ORE);
            entries.add(ModBlocks.NETHERRACK_ROSE_QUARTZ_ORE);
            entries.add(ModBlocks.DEEPSLATE_ROSE_QUARTZ_ORE);
        });
    }

}
