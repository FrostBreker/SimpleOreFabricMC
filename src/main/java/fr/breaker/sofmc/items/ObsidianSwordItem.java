package fr.breaker.sofmc.items;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ObsidianSwordItem extends SwordItem
{
    public ObsidianSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);
    }
}

