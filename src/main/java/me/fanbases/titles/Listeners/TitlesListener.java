package me.fanbases.titles.Listeners;

import me.fanbases.titles.Titles;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class TitlesListener implements Listener {

    private final Titles titles;

    public TitlesListener(Titles titles) {
        this.titles = titles;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        //When player joins, send title, register tab list and action bar.
        e.getPlayer().sendTitle(titles.getConfig().getString("FirstLine"),
                titles.getConfig().getString("SecondLine"),
                titles.getConfig().getInt("Fade-in"),
                titles.getConfig().getInt("Stay"),
                titles.getConfig().getInt("Fade-out"));
    }

}
