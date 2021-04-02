package fr.breaker.sofmc.toolsmaterials;

import fr.breaker.sofmc.init.ModItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial
{
    public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();

    @Override
    public int getDurability() {
        return 750;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5f;
    }

    @Override
    public float getAttackDamage() {
        return 6;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.OBSIDIAN_INGOT);
    }
}
