package com.brand.adabraniummod.stuff.vibranium;

import com.brand.adabraniummod.items.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MaterialVibraniumTool implements ToolMaterial
{
    @Override
    public int getDurability()
    {
        return 8500;
    }

    @Override
    public float getMiningSpeedMultiplier()
    {
        return 20f;
    }

    @Override
    public float getAttackDamage()
    {
        return 10f;
    }

    @Override
    public int getMiningLevel()
    {
        return 3;
    }

    @Override
    public int getEnchantability()
    {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.VIBRANIUM_INGOT);
    }
}
