package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.item.SimpleItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = ITEMS.register("example_item", SimpleItem::new);
}
