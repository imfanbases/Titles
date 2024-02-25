package me.fanbases.titles.Listeners;

import me.fanbases.titles.Titles;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TablistListener implements Listener {

    private final Titles titles;

    public TablistListener(Titles titles) {
        this.titles = titles;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().setPlayerListHeader(titles.getConfig().getString("Header"));
        e.getPlayer().setPlayerListFooter(titles.getConfig().getString("Footer"));
    }
}
