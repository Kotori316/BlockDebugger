package com.kotori316.blockdebugger.proxy

import com.kotori316.blockdebugger.BlockDebugger
import com.kotori316.blockdebugger.blocks.BlockProjector
import com.kotori316.blockdebugger.tiles.TileProjector
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraft.tileentity.TileEntity
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.event.{FMLInitializationEvent, FMLPreInitializationEvent}
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

class CommonProxy {

    def preInit(event: FMLPreInitializationEvent): Unit = {
        MinecraftForge.EVENT_BUS.register(this)
    }

    def init(event: FMLInitializationEvent): Unit = {

    }

    @SubscribeEvent
    def registerBlocks(event: RegistryEvent.Register[Block]): Unit = {
        event.getRegistry.register(BlockProjector)
        TileEntity.register(BlockDebugger.modID + ":tile." + BlockProjector.NAME, classOf[TileProjector])
    }

    @SubscribeEvent
    def registerItems(event: RegistryEvent.Register[Item]): Unit = {
    }

}
