package com.kotori316.blockdebugger.blocks

import com.kotori316.blockdebugger.BlockDebugger
import com.kotori316.blockdebugger.tiles.TileProjector
import net.minecraft.block.BlockContainer
import net.minecraft.block.material.Material
import net.minecraft.creativetab.CreativeTabs
import net.minecraft.item.ItemBlock
import net.minecraft.world.World

object BlockProjector extends BlockContainer(Material.ANVIL) {
    final val NAME = "blockprojector"
    setUnlocalizedName(NAME)
    setRegistryName(BlockDebugger.modID, NAME)
    setCreativeTab(CreativeTabs.DECORATIONS)

    val itemBlock = new ItemBlock(this)
    itemBlock.setRegistryName(BlockDebugger.modID, NAME)

    override def createNewTileEntity(worldIn: World, meta: Int) = new TileProjector
}
