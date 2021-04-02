package fr.breaker.sofmc.toolsmaterials;

import fr.breaker.sofmc.init.ModItem;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;

public class BasaltToolMaterial implements net.minecraft.item.ToolMaterial
{
    public static final BasaltToolMaterial INSTANCE = new BasaltToolMaterial();

    @Override
    public int getDurability() {
        return 300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1.9f;
    }

    @Override
    public float getAttackDamage() {
        return 3;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.BASALT_INGOT);
    }
}
