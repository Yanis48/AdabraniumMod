package com.brand.adabraniummod.mixin;

import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;
import java.util.Set;

@Mixin(AxeItem.class)
public interface AxeItemAccessor {
	@Accessor("STRIPPED_BLOCKS")
	public static Map<Block, Block> getStrippedBlocks() {
		return null;
	}
	
	@Accessor("EFFECTIVE_BLOCKS")
	public static Set<Block> getEffectiveBlocks() {
		return null;
	}
}
