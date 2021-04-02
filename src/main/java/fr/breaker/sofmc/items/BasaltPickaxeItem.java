package fr.breaker.sofmc.items;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BasaltPickaxeItem extends PickaxeItem
{
    public BasaltPickaxeItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);
    }
}
