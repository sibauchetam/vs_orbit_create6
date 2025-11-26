package net.cn_good_grass.vs_orbit.procedures.create.DisplaySource;

import com.simibubi.create.api.behaviour.display.DisplaySource;
import com.simibubi.create.content.redstone.displayLink.DisplayLinkContext;
import com.simibubi.create.content.redstone.displayLink.source.SingleLineDisplaySource;
import com.simibubi.create.content.redstone.displayLink.target.DisplayTargetStats;
import net.cn_good_grass.vs_orbit.block.blocks.CelestialTachymeterBlock;
import net.minecraft.network.chat.MutableComponent;
import com.simibubi.create.foundation.utility.Components;

public class CelestialTachymeterDisplaySource extends SingleLineDisplaySource {

    @Override
    protected MutableComponent provideLine(DisplayLinkContext context, DisplayTargetStats stats) {
        if (!(context.getSourceBlockState().getBlock() instanceof CelestialTachymeterBlock block)) {
            return Components.literal("0.0");
        }
        return Components.literal(String.valueOf(block.getSpeed(context.level(), context.getSourcePos())));
    }

    @Override
    protected String getTranslationKey() {
        return "display_source.celestial_tachymeter";
    }

    @Override
    protected boolean allowsLabeling(DisplayLinkContext context) {
        return true;
    }
}
