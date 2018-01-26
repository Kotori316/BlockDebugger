package com.kotori316.blockdebugger.proxy

import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.relauncher.{Side, SideOnly}

@SideOnly(Side.CLIENT)
class ClientProxy extends CommonProxy {

    @SubscribeEvent
    def registerModels(event: ModelRegistryEvent): Unit = {
    }

}
