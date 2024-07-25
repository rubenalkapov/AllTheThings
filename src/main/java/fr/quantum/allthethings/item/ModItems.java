package fr.quantum.allthethings.item;


import fr.quantum.allthethings.item.tools.*;
import fr.quantum.allthethings.material.ToolsMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import fr.quantum.allthethings.Allthethings;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Allthethings.MOD_ID);


    public static final RegistryObject<Item> MORION = ITEMS.register("morion", () -> new Item(new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    public static final RegistryObject<Item> MORION_PICKAXE = ITEMS.register("morion_pickaxe", () -> new PickaxeItem(ToolsMaterial.MORION, 1, -2.8F, new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    public static final RegistryObject<Item> MORION_AXE = ITEMS.register("morion_axe", () -> new AxeItem(ToolsMaterial.MORION, 5.0F, -3.0F, new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    public static final RegistryObject<Item> MORION_SHOVEL = ITEMS.register("morion_shovel", () -> new ShovelItem(ToolsMaterial.MORION, 1.5F, -3.0F, new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    public static final RegistryObject<Item> MORION_HOE = ITEMS.register("morion_hoe", () -> new HoeItem(ToolsMaterial.MORION, -4, 0.0F, new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));
    public static final RegistryObject<Item> MORION_SWORD = ITEMS.register("morion_sword", () -> new SwordItem(ToolsMaterial.MORION, 3, -2.4F, new Item.Properties().tab(ModItemGroup.ALLTHETHINGS_GROUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}