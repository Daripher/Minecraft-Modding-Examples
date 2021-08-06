package com.example.examplemod;

import com.example.examplemod.init.ItemInit;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ExampleMod
{
	// The value here should match an entry in the META-INF/mods.toml file
	public static final String MOD_ID = "examplemod";
	
	public ExampleMod()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ItemInit.ITEMS.register(modEventBus);
	}
}
