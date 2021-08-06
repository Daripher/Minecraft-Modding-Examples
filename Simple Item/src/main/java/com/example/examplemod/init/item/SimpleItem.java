package com.example.examplemod.init.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class SimpleItem extends Item
{
	public SimpleItem()
	{
		super(new Properties().tab(CreativeModeTab.TAB_MISC));
	}
}
