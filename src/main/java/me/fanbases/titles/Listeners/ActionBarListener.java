package me.fanbases.titles.Listeners;

import me.fanbases.titles.Titles;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ActionBarListener implements Listener {

    private final Titles titles;

    public ActionBarListener(Titles titles) {
        this.titles = titles;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        e.getPlayer().spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacy(titles.getConfig().getString("Action-Bar")));
    }

}
