package fr.breaker.sofmc.blocks;

import fr.breaker.sofmc.blockentity.ForgeFurnaceBlockEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ForgeFurnace extends AbstractFurnaceBlock {
    public ForgeFurnace(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockView world) {
        return new ForgeFurnaceBlockEntity();
    }

    @Override
    public void openScreen(World world, BlockPos pos, PlayerEntity player) {
        //This is called by the onUse method inside AbstractFurnaceBlock so
        //it is a little bit different of how you open the screen for normal container
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof ForgeFurnaceBlockEntity) {
            player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
            // Optional: increment player's stat
            player.incrementStat(Stats.INTERACT_WITH_FURNACE);
        }
    }
}
