package net.saoirse.saoirsemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BonemealableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

import java.util.Set;

public class GrowthTotemBlock extends Block {
    private static final int EFFECT_RADIUS = 5;
    private static final int GROWTH_BOOST = 2;

    private static final Set<Block> EXCLUDED_BLOCKS = Set.of(
            Blocks.GRASS,
            Blocks.GRASS_BLOCK,
            Blocks.FERN,
            Blocks.TALL_GRASS,
            Blocks.PODZOL,
            Blocks.MYCELIUM
    );

    public GrowthTotemBlock(Properties properties){
        super(properties);
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        if (!pLevel.isClientSide){
            pLevel.scheduleTick(pPos, this, 12000); //Schedules the first tick in first (1) minute(s)
        }
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isClientSide){
            // Gets all blocks in the defined area (EFFECT RADIUS)
            AABB area = new AABB(pPos).inflate(EFFECT_RADIUS);
            BlockPos.betweenClosedStream(area).forEach(blockPos -> {
                BlockState blockState = pLevel.getBlockState(blockPos);
                Block block = blockState.getBlock();

                if (block instanceof BonemealableBlock bonemealable && !EXCLUDED_BLOCKS.contains(block)){
                    if (bonemealable.isValidBonemealTarget(pLevel, blockPos, blockState, pLevel.isClientSide)){
                        if (pRandom.nextInt(2) == 0){
                            bonemealable.performBonemeal(pLevel, pRandom, blockPos, blockState);
                        }
                    }
                }

            });

            // Schedule next tick (every (10) minute(s)) 12000 ticks
            pLevel.scheduleTick(pPos, this, 12000);
        }
    }
}
