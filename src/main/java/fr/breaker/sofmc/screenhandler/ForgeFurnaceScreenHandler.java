package fr.breaker.sofmc.screenhandler;

import fr.breaker.sofmc.SofmcMod;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractFurnaceScreenHandler;
import net.minecraft.screen.PropertyDelegate;

public class ForgeFurnaceScreenHandler extends AbstractFurnaceScreenHandler {
    public ForgeFurnaceScreenHandler(int i, PlayerInventory playerInventory) {
        super(SofmcMod.FORGE_FURNACE_SCREEN_HANDLER, SofmcMod.FORGE_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory);
    }

    public ForgeFurnaceScreenHandler(int i, PlayerInventory playerInventory, Inventory inventory, PropertyDelegate propertyDelegate) {
        super(SofmcMod.FORGE_FURNACE_SCREEN_HANDLER, SofmcMod.FORGE_RECIPE_TYPE, RecipeBookCategory.FURNACE, i, playerInventory, inventory, propertyDelegate);
    }
}
