package fr.breaker.sofmc.armormaterials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class RedstoneArmorMaterial implements ArmorMaterial
{
    public static final RedstoneArmorMaterial INSTANCE = new RedstoneArmorMaterial();

    private static final int[] BASE_DURABILITY = new int[] {12, 14, 15, 10};
    private static final int[] PROTECTION_VALUES = new int[] {1, 4, 6, 1};

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
        return Ingredient.ofItems(Items.REDSTONE);
    }

    @Override
    public String getName() {
        return "redstone_armor";
    }

    @Override
    public float getToughness() {
        return 2.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.1F;
    }
}
