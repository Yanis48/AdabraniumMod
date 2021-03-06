package com.brand.adabraniummod.stuff.vanilla.wooden;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public class MaterialWoodenPaxel implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 177;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 2.0F;
    }

    @Override
    public float getAttackDamage()
    {
        return 1.0f;
    }

    @Override
    public int getMiningLevel()
    {
        return 0;
    }

    @Override
    public int getEnchantability()
    {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }
}
