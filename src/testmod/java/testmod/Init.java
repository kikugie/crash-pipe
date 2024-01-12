package testmod;

import net.fabricmc.api.ModInitializer;

public class Init implements ModInitializer {
    @Override
    public void onInitialize() {
        throw new RuntimeException("YEET");
    }
}