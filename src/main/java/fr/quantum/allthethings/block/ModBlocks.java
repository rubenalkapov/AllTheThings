package fr.quantum.allthethings.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import fr.quantum.allthethings.Allthethings;
import fr.quantum.allthethings.item.ModItemGroup;
import fr.quantum.allthethings.item.ModItems;

import java.util.function.Supplier;

import static net.minecraftforge.registries.ForgeRegistries.TILE_ENTITIES;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Allthethings.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, Allthethings.MOD_ID);

    public static final RegistryObject<Block> MORION_ORE = registerBlock("morion_ore",
            () -> new Block(AbstractBlock.Properties.copy(Blocks.IRON_ORE)
                    .harvestLevel(2).harvestTool(ToolType.PICKAXE).strength(10f, 5f)));

    public static final RegistryObject<Block> CUSTOM_FURNACE = registerBlock("morion_furnace",
            () -> new MorionFurnaceBlock(AbstractBlock.Properties.of(Material.STONE)
                    .strength(3.5F)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .requiresCorrectToolForDrops()));

    public static final RegistryObject<TileEntityType<MorionFurnaceTile>> CUSTOM_FURNACE_TILE = TILE_ENTITIES.register("morion_furnace_tile",
            () -> TileEntityType.Builder.of(MorionFurnaceTile::new, CUSTOM_FURNACE.get()).build(null));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        TILE_ENTITIES.register(eventBus);
    }
}