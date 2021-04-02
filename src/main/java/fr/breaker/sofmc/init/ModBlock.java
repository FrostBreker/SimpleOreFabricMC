package fr.breaker.sofmc.init;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlock
{
    public static final ModBlock INSTANCE = new ModBlock();

    public void registerAll()
    {

    }

    private void register(Block block, Identifier name)
    {
        Registry.register(Registry.BLOCK, name, block);
        createBlockItem(block, name);
    }

    private void createBlockItem(Block block, Identifier name)
    {
        Registry.register(Registry.ITEM, name, new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
}
