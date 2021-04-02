package fr.breaker.sofmc.armormaterials;

import fr.breaker.sofmc.init.ModItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class BasaltArmorMaterial implements ArmorMaterial
{
    public static final BasaltArmorMaterial INSTANCE = new BasaltArmorMaterial();

    private static final int[] BASE_DURABILITY = new int[] {10, 12, 13, 8};
    private static final int[] PROTECTION_VALUES = new int[] {0, 3, 5, 0};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 40;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItem.BASALT_INGOT);
    }

    @Override
    public String getName() {
        return "basalt_armor";
    }

    @Override
    public float getToughness() {
        return 2F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.09F;
    }
}
