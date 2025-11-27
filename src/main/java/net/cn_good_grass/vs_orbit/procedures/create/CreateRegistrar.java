package net.cn_good_grass.vs_orbit.procedures.create;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.cn_good_grass.vs_orbit.VSOrbitMod;
import net.cn_good_grass.vs_orbit.procedures.create.DisplaySource.CelestialTachymeterDisplaySource;
import com.simibubi.create.api.behaviour.display.DisplaySource;

public class CreateRegistrar {
    private static final CreateRegistrate REGISTRATE = VSOrbitMod.registrate();

    public static final RegistryEntry<DisplaySource, CelestialTachymeterDisplaySource> CELESTIAL_TACHYMETER_DISPLAY_SOURCE = REGISTRATE.displaySource("celestial_tachymeter_display_source", CelestialTachymeterDisplaySource::new)
            .register();

    public static void register() {
    }
}
