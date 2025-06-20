package net.johnt.middleearthmod;

import net.fabricmc.api.ModInitializer;

import net.johnt.middleearthmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiddleEarthMod implements ModInitializer {
	public static final String MOD_ID = "middleearthmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}