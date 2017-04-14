package com.kashdeya.tinyprogressions.blocks.misc;

import java.util.Random;

import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.main.tinyprogressions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.world.Explosion;

public class AmethystBlock extends Block {
	
	public AmethystBlock()
    {
        super(Material.ROCK);
        this.setHardness(3.0F);
        this.setResistance(15.0F);
        this.setSoundType(blockSoundType.STONE);
        this.setCreativeTab(tinyprogressions.tabTP);
        this.setUnlocalizedName("amethyst_block");
    }
	
	/**
     * Get the Item that this Block should drop when harvested.
     */
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TechBlocks.amethyst_block);
    }
	
	@Override
    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }
	
	@Override
    public int quantityDropped(Random rand)
    {
        return 1;
    }
}