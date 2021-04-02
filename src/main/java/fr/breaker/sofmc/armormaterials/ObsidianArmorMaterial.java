package fr.breaker.sofmc.armormaterials;

import fr.breaker.sofmc.init.ModItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class ObsidianArmorMaterial implements ArmorMaterial
{
    public static final ObsidianArmorMaterial INSTANCE = new ObsidianArmorMaterial();

    private static final int[] BASE_DURABILITY = new int[] {14, 16, 17, 12};
    private static final int[] PROTECTION_VALUES = new int[] {5, 8, 10, 5};

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
        return Ingredient.ofItems(ModItem.OBSIDIAN_INGOT);
    }

    @Override
    public String getName() {
        return "obsidian_armor";
    }

    @Override
    public float getToughness() {
        return 3.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2F;
    }
}
