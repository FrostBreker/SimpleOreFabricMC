package fr.breaker.sofmc.items;

import fr.breaker.sofmc.toolsmaterials.EmeraldToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class EmeraldSwordItem extends SwordItem
{
    public EmeraldSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, (int) attackDamage, attackSpeed, settings);
    }
}
