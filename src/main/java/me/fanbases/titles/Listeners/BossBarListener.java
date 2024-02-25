package me.fanbases.titles.Listeners;

import me.fanbases.titles.Titles;
import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class BossBarListener implements Listener {

    private final Titles titles;

    public BossBarListener(Titles titles) {
        this.titles = titles;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        //When player joins, send title, register tab list and action bar.
        BossBar bossBar = Bukkit.createBossBar(titles.getConfig().getString("Title"), BarColor.PINK, BarStyle.SEGMENTED_6);
        bossBar.setProgress(0.5);

    }


}
