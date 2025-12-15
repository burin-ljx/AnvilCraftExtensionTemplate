package dev.your_name.anvilextension;

import com.tterrag.registrate.Registrate;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(AnvilCraftExtensionMod.MOD_ID)
public class AnvilCraftExtensionMod {
    public static final String MOD_ID = "anvilcraft_extension";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Registrate REGISTRATE = Registrate.create(MOD_ID);

    public AnvilCraftExtensionMod(IEventBus eventBus) {
        LOGGER.info("Mod loading");
    }

    public static ResourceLocation of(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
