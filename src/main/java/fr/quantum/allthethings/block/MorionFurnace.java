package fr.quantum.allthethings.block;

import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

public class MorionFurnace extends AbstractFurnaceBlock {

    protected MorionFurnace(Properties p_i50000_1_) {
        super(p_i50000_1_);
    }

    @Override
    public TileEntity newBlockEntity(IBlockReader worldIn) {
        return new MorionFurnaceTile();
    }

    @Override
    protected void openContainer(World p_220089_1_, BlockPos p_220089_2_, PlayerEntity p_220089_3_) {

    }
}
