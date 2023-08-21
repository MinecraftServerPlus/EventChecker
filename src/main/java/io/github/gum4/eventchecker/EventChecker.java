package io.github.gum4.eventchecker;

import io.github.gum4.eventchecker.listeners.MoveListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EventChecker extends JavaPlugin {
    private final MoveListener moveListener = new MoveListener();
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(moveListener, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
