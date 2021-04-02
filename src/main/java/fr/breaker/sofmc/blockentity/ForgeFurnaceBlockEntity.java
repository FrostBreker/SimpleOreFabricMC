package fr.breaker.sofmc.blockentity;

import fr.breaker.sofmc.SofmcMod;
import fr.breaker.sofmc.screenhandler.ForgeFurnaceScreenHandler;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;

public class ForgeFurnaceBlockEntity extends AbstractFurnaceBlockEntity {
    //Since we already now the BlockEntityType and RecipeType we don't need them in the constructor's parameters
    public ForgeFurnaceBlockEntity() {
        super(SofmcMod.FORGE_FURNACE_BLOCK_ENTITY, SofmcMod.FORGE_RECIPE_TYPE);
    }

    @Override
    public Text getContainerName() {
        //you should use a translation key instead but this is easier
        return Text.of("Forge");
    }

    @Override
    public ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new ForgeFurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }
}
