package fr.breaker.sofmc;

import fr.breaker.sofmc.screenhandler.ForgeFurnaceScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class SofmcClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(SofmcMod.FORGE_FURNACE_SCREEN_HANDLER, ForgeFurnaceScreen::new);
    }
}