package fr.breaker.sofmc.init;

import fr.breaker.sofmc.SofmcMod;
import fr.breaker.sofmc.armormaterials.EmeraldArmorMaterial;
import fr.breaker.sofmc.armormaterials.ObsidianArmorMaterial;
import fr.breaker.sofmc.items.*;
import fr.breaker.sofmc.toolsmaterials.EmeraldToolMaterial;
import fr.breaker.sofmc.toolsmaterials.ObsidianToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItem
{
//Divers
    public static final Item OBSIDIAN_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
//Obsidian
    public static final Item OBSIDIAN_SWORD = new ObsidianSwordItem(ObsidianToolMaterial.INSTANCE, 1, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_PICKAXE = new ObsidianPickaxeItem(ObsidianToolMaterial.INSTANCE, -2, -2.8f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_AXE = new ObsidianAxeItem(ObsidianToolMaterial.INSTANCE, 2, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_SHOVEL = new ObsidianShoveItem(ObsidianToolMaterial.INSTANCE, -3, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_HOE = new ObsidianHoeItem(ObsidianToolMaterial.INSTANCE, -4, -0f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item OBSIDIAN_HELMET = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_LEGGINGS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item OBSIDIAN_BOOTS = new ArmorItem(ObsidianArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
//Emerald
    public static final Item EMERALD_SWORD = new EmeraldSwordItem(EmeraldToolMaterial.INSTANCE, 2, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
    public static final Item EMERALD_PICKAXE = new EmeraldPickaxeItem(EmeraldToolMaterial.INSTANCE, -1, -2.8f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item EMERALD_AXE = new EmeraldAxeItem(EmeraldToolMaterial.INSTANCE, 3, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item EMERALD_SHOVEL = new EmeraldShoveItem(EmeraldToolMaterial.INSTANCE, -2, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item EMERALD_HOE = new EmeraldHoeItem(EmeraldToolMaterial.INSTANCE, -3, -0f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item EMERALD_HELMET = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_CHESTPLATE = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_LEGGINGS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item EMERALD_BOOTS = new ArmorItem(EmeraldArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerAll()
    {
        //Divers
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_ingot"), OBSIDIAN_INGOT);
        //Obsidian
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_sword"), OBSIDIAN_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_pickaxe"), OBSIDIAN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_axe"), OBSIDIAN_AXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_shovel"), OBSIDIAN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_hoe"), OBSIDIAN_HOE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_helmet"), OBSIDIAN_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_chestplate"), OBSIDIAN_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_leggings"), OBSIDIAN_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_boots"), OBSIDIAN_BOOTS);
        //Emerald
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_sword"), EMERALD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_pickaxe"), EMERALD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_axe"), EMERALD_AXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_shovel"), EMERALD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_hoe"), EMERALD_HOE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_helmet"), EMERALD_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_chestplate"), EMERALD_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_leggings"), EMERALD_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "emerald_boots"), EMERALD_BOOTS);
    }
}