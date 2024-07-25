package fr.quantum.allthethings.item.tools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class MorionPickaxe extends PickaxeItem {
    public MorionPickaxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties properties) {
        super(tier, attackDamageIn, attackSpeedIn, properties);
    }
}
