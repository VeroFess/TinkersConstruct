package slimeknights.tconstruct.world.worldgen;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeature;
import slimeknights.tconstruct.shared.TinkerCommons;
import slimeknights.tconstruct.world.TinkerWorld;

import javax.annotation.Nullable;
import java.util.Random;

public class MagmaSlimeTree extends Tree {

  @Override
  @Nullable
  protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
    return new SlimeTreeFeature(NoFeatureConfig::deserialize, true, 5, 4, TinkerCommons.congealed_magma_slime.getDefaultState(), TinkerWorld.orange_slime_leaves.getDefaultState(), null, TinkerWorld.orange_slime_sapling, true);
  }
}