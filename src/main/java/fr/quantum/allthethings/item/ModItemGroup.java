package fr.quantum.allthethings.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup ALLTHETHINGS_GROUP = new ItemGroup("allthethingsModTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MORION.get());
        }
    };

}