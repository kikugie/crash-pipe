package dev.kikugie.crash_pipe.mixin;

import dev.kikugie.crash_pipe.SoundLoader;
import net.minecraft.util.crash.CrashReport;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = CrashReport.class)
public class CrashReportMixin {
    @Inject(method = "create", at = @At("HEAD"))
    private static void playTheFunny(Throwable cause, String title, CallbackInfoReturnable<CrashReport> cir) {
        SoundLoader.tryPlay();
    }
}