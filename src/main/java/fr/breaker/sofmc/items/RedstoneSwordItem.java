package fr.breaker.sofmc.items;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class RedstoneSwordItem extends SwordItem
{
    public RedstoneSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);
    }
}