package net.cn_good_grass.vs_orbit.procedures.create;

import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.simibubi.create.api.registry.CreateRegistries;
import net.cn_good_grass.vs_orbit.VSOrbitMod;
import net.cn_good_grass.vs_orbit.procedures.create.DisplaySource.CelestialTachymeterDisplaySource;
import net.minecraft.resources.ResourceLocation;

public class CreateRegistrar {
    public static void register() {
        CreateRegistries.DISPLAY_SOURCES.register(new ResourceLocation(VSOrbitMod.MODID, "celestial_tachymeter_display_source"), CelestialTachymeterDisplaySource::new);
    }
}
