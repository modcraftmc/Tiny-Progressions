package com.kashdeya.tinyprogressions.items.misc;

import java.util.List;

import javax.annotation.Nullable;

import com.kashdeya.tinyprogressions.items.ItemBase;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CorruptedHexa extends ItemBase {

	public CorruptedHexa() {
		super(new Properties().maxStackSize(1));
	}

	public void onUpdate(ItemStack stack, World worldIn, Entity player, int itemSlot, boolean isSelected) {
		if (player instanceof PlayerEntity)
			((PlayerEntity) player).addPotionEffect(new EffectInstance(Effects.POISON, 20 * 20, 0, true, true));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		tooltip.add(new TranslationTextComponent("tooltip.warning_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
		tooltip.add(new TranslationTextComponent("tooltip.hexa_1").setStyle(new Style().setColor(TextFormatting.YELLOW)));
	}
}
