package fr.breaker.sofmc.init;

import fr.breaker.sofmc.SofmcMod;
import fr.breaker.sofmc.armormaterials.BasaltArmorMaterial;
import fr.breaker.sofmc.armormaterials.EmeraldArmorMaterial;
import fr.breaker.sofmc.armormaterials.ObsidianArmorMaterial;
import fr.breaker.sofmc.armormaterials.RedstoneArmorMaterial;
import fr.breaker.sofmc.items.*;
import fr.breaker.sofmc.toolsmaterials.BasaltToolMaterial;
import fr.breaker.sofmc.toolsmaterials.EmeraldToolMaterial;
import fr.breaker.sofmc.toolsmaterials.ObsidianToolMaterial;
import fr.breaker.sofmc.toolsmaterials.RedstoneToolMaterial;
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
    public static final Item BASALT_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
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
    //Redstone
    public static final Item REDSTONE_SWORD = new RedstoneSwordItem(RedstoneToolMaterial.INSTANCE, -1, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
    public static final Item REDSTONE_PICKAXE = new RedstonePickaxeItem(RedstoneToolMaterial.INSTANCE, -4, -2.8f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item REDSTONE_AXE = new RedstoneAxeItem(RedstoneToolMaterial.INSTANCE, 0, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item REDSTONE_SHOVEL = new RedstoneShoveItem(RedstoneToolMaterial.INSTANCE, -5, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item REDSTONE_HOE = new RedstoneHoeItem(RedstoneToolMaterial.INSTANCE, -6, -0f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item REDSTONE_HELMET = new ArmorItem(RedstoneArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REDSTONE_CHESTPLATE = new ArmorItem(RedstoneArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REDSTONE_LEGGINGS = new ArmorItem(RedstoneArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item REDSTONE_BOOTS = new ArmorItem(RedstoneArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));
    //Basalt
    public static final Item BASALT_SWORD = new BasaltSwordItem(BasaltToolMaterial.INSTANCE, 0, -2.4f, new Item.Settings().maxCount(1).group(ItemGroup.COMBAT));
    public static final Item BASALT_PICKAXE = new BasaltPickaxeItem(BasaltToolMaterial.INSTANCE, -3, -2.8f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item BASALT_AXE = new BasaltAxeItem(BasaltToolMaterial.INSTANCE, 1, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item BASALT_SHOVEL = new BasaltShoveItem(BasaltToolMaterial.INSTANCE, -3, -3f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item BASALT_HOE = new BasaltHoeItem(BasaltToolMaterial.INSTANCE, -3, -0f, new Item.Settings().maxCount(1).group(ItemGroup.TOOLS));
    public static final Item BASALT_HELMET = new ArmorItem(BasaltArmorMaterial.INSTANCE, EquipmentSlot.HEAD, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BASALT_CHESTPLATE = new ArmorItem(BasaltArmorMaterial.INSTANCE, EquipmentSlot.CHEST, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BASALT_LEGGINGS = new ArmorItem(BasaltArmorMaterial.INSTANCE, EquipmentSlot.LEGS, new Item.Settings().group(ItemGroup.COMBAT));
    public static final Item BASALT_BOOTS = new ArmorItem(BasaltArmorMaterial.INSTANCE, EquipmentSlot.FEET, new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerAll()
    {
        //Divers
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "obsidian_ingot"), OBSIDIAN_INGOT);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_ingot"), BASALT_INGOT);
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
        //Redstone
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_sword"), REDSTONE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_pickaxe"), REDSTONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_axe"), REDSTONE_AXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_shovel"), REDSTONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_hoe"), REDSTONE_HOE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_helmet"), REDSTONE_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_chestplate"), REDSTONE_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_leggings"), REDSTONE_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "redstone_boots"), REDSTONE_BOOTS);
        //Basalt
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_sword"), BASALT_SWORD);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_pickaxe"), BASALT_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_axe"), BASALT_AXE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_shovel"), BASALT_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_hoe"), BASALT_HOE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_helmet"), BASALT_HELMET);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_chestplate"), BASALT_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_leggings"), BASALT_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(SofmcMod.MODID, "basalt_boots"), BASALT_BOOTS);
    }
}