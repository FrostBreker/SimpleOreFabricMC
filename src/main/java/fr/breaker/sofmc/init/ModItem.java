package fr.breaker.sofmc.init;

import fr.breaker.sofmc.SofmcMod;
import fr.breaker.sofmc.armormaterials.ObsidianArmorMaterial;
import fr.breaker.sofmc.items.*;
import fr.breaker.sofmc.toolsmaterials.ObsidianToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItem
{
    public static final Item OBSIDIAN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item OBSIDIAN_SWORD = new ObsidianSwordItem(ObsidianToolMaterial.INSTANCE, 1, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_PICKAXE = new ObsidianPickaxeItem(ObsidianToolMaterial.INSTANCE, -2, -2.8f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_AXE = new ObsidianAxeItem(ObsidianToolMaterial.INSTANCE, 2, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_SHOVEL = new ObsidianShoveItem(ObsidianToolMaterial.INSTANCE, -3, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_HOE = new ObsidianHoeItem(ObsidianToolMaterial.INSTANCE, -4, -0f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_HELMET = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerAll()
    {
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_hoe"), OBSIDIAN_HOE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_boots"), OBSIDIAN_BOOTS);
    }
}