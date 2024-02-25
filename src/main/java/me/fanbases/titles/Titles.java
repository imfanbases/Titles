package me.fanbases.titles;

import lombok.Getter;
import me.fanbases.titles.Listeners.ActionBarListener;
import me.fanbases.titles.Listeners.BossBarListener;
import me.fanbases.titles.Listeners.TablistListener;
import me.fanbases.titles.Listeners.TitlesListener;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Titles extends JavaPlugin implements Listener {

    @Getter
    private static Titles instance;

    public Titles() {

    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new TitlesListener(this), this);
        Bukkit.getPluginManager().registerEvents(new TablistListener(this), this);
        Bukkit.getPluginManager().registerEvents(new ActionBarListener(this), this);
        Bukkit.getPluginManager().registerEvents(new BossBarListener(this), this);
        System.out.println("[Titles] v1.0 Plugin Loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("[Titles] v1.0 Plugin Shutdown");
    }

}
