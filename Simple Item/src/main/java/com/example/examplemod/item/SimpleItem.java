package com.example.examplemod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class SimpleItem extends Item
{
	public SimpleItem()
	{
		super(new Properties().tab(CreativeModeTab.TAB_MISC));
	}
}
