package fr.breaker.sofmc;

import fr.breaker.sofmc.blockentity.ForgeFurnaceBlockEntity;
import fr.breaker.sofmc.blocks.ForgeFurnace;
import fr.breaker.sofmc.init.ModBlock;
import fr.breaker.sofmc.init.ModItem;
import fr.breaker.sofmc.recipes.ForgeRecipe;
import fr.breaker.sofmc.screenhandler.ForgeFurnaceScreenHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.recipe.CookingRecipeSerializer;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SofmcMod implements ModInitializer {
    public static final String MODID = "sofmc";

    public static final Block FORGE_FURNACE_BLOCK;
    public static final BlockEntityType FORGE_FURNACE_BLOCK_ENTITY;
    public static final RecipeType<ForgeRecipe> FORGE_RECIPE_TYPE;
    public static final RecipeSerializer<ForgeRecipe> FORGE_RECIPE_SERIALIZER;
    public static final ScreenHandlerType<ForgeFurnaceScreenHandler> FORGE_FURNACE_SCREEN_HANDLER;


    static {
        //Block
        FORGE_FURNACE_BLOCK = Registry.register(Registry.BLOCK, new Identifier(MODID, "forge_furnace"), new ForgeFurnace(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES).strength(3f, 3f)));
        //BlockItem
        Registry.register(Registry.ITEM, new Identifier(MODID, "forge_furnace"), new BlockItem(FORGE_FURNACE_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        //BlockEntity
        FORGE_FURNACE_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(MODID, "forge_furnace"), BlockEntityType.Builder.create(ForgeFurnaceBlockEntity::new, FORGE_FURNACE_BLOCK).build(null));

        FORGE_RECIPE_TYPE = Registry.register(Registry.RECIPE_TYPE, new Identifier(MODID, "forge_furnace"), new RecipeType<ForgeRecipe>() {
            @Override
            public String toString() {
                return "test_furnace";
            }
        });

        FORGE_RECIPE_SERIALIZER = Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(MODID, "forge_furnace"), new CookingRecipeSerializer<>(ForgeRecipe::new, 150));

        FORGE_FURNACE_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(new Identifier(MODID, "forge_furnace"), ForgeFurnaceScreenHandler::new);
    }

    @Override
    public void onInitialize() {
        ModItem.registerAll();
        ModBlock.INSTANCE.registerAll();
    }
}