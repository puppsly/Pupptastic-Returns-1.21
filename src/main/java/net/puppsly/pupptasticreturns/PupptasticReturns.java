package net.puppsly.pupptasticreturns;

import net.fabricmc.api.ModInitializer;

import net.puppsly.pupptasticreturns.block.ModBlocks;
import net.puppsly.pupptasticreturns.item.ModItemGroups;
import net.puppsly.pupptasticreturns.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PupptasticReturns implements ModInitializer {
	public static final String MOD_ID = "pupptasticreturns";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();


		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}