package com.kotori316.blockdebugger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kotori316.blockdebugger.proxy.CommonProxy;

@Mod(name = BlockDebugger.MOD_NAME, modid = BlockDebugger.modID, version = "${version}")
public class BlockDebugger {

    public static final BlockDebugger instance;
    public static final String MOD_NAME = "BlockDebugger";
    public static final String modID = "blockdebugger";
    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static final String ServerProxy = "com.kotori316.blockdebugger.proxy.CommonProxy";
    public static final String ClientProxy = "com.kotori316.blockdebugger.proxy.ClientProxy";
    @SidedProxy(serverSide = ServerProxy, clientSide = ClientProxy)
    public static CommonProxy proxy = null;

    static {
        instance = new BlockDebugger();
        MinecraftForge.EVENT_BUS.register(instance);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @Mod.InstanceFactory
    public static BlockDebugger getInstance() {
        return instance;
    }
}