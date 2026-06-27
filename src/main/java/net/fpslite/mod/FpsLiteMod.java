package net.fpslite.mod;

import net.fpslite.mod.config.FpsLiteConfig;
import net.fpslite.mod.event.ClientEventHandler;
import net.fpslite.mod.event.RenderEventHandler;
import net.fpslite.mod.compat.EmbeddiumCompat;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(FpsLiteMod.MOD_ID)
public class FpsLiteMod {

    public static final String MOD_ID = "fpslite";
    public static final String MOD_NAME = "FPS Lite Ultra";
    public static
