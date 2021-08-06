package com.example.examplemod.init;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.init.block.SimpleBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", SimpleBlock::new);
	
	// Automatically registers items for every block
	@SubscribeEvent
	public static void createBlockItems(final RegistryEvent.Register<Item> event)
	{
		BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block ->
		{
			Item.Properties properties = new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS);
			Item blockItem = new BlockItem(block, properties);
			blockItem.setRegistryName(block.getRegistryName());
			event.getRegistry().register(blockItem);
		});
	}
}
