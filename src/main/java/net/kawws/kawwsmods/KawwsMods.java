package net.kawws.kawwsmods;

import net.fabricmc.api.ModInitializer;

import net.kawws.kawwsmods.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KawwsMods implements ModInitializer {
	public static final String MOD_ID = "kawwsmods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}