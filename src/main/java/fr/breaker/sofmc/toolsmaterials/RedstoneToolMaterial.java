package fr.breaker.sofmc.toolsmaterials;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class RedstoneToolMaterial implements net.minecraft.item.ToolMaterial
{
    public static final RedstoneToolMaterial INSTANCE = new RedstoneToolMaterial();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2f;
    }

    @Override
    public float getAttackDamage() {
        return 4;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.REDSTONE);
    }
}
