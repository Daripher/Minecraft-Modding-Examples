package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.SimpleBlockItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_BLOCK = ITEMS.register("example_block", () -> new SimpleBlockItem(BlockInit.EXAMPLE_BLOCK.get()));
}
