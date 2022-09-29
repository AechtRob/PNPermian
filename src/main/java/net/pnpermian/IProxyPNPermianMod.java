package net.pnpermian;


import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public interface IProxyPNPermianMod {
    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postInit(FMLPostInitializationEvent event);

    void serverLoad(FMLServerStartingEvent event);
}
