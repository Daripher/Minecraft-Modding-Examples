package com.example.examplemod.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;

public class SimpleBlockItem extends BlockItem
{
	public SimpleBlockItem(Block block)
	{
		super(block, new Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
	}
}
