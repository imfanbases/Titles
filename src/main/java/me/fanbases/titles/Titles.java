package me.fanbases.titles;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Titles extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(this, this);
        System.out.println("[Titles] v1.0 Plugin Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Titles] v1.0 Plugin Shutdown");
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        //When player joins, send title, register tab list and action bar.
        e.getPlayer().sendTitle(getConfig().getString("FirstLine"), getConfig().getString("SecondLine"), getConfig().getInt("Fade-in"), getConfig().getInt("Stay"), getConfig().getInt("Fade-out"));
    }
}
