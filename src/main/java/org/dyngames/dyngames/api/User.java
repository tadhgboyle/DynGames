package org.dyngames.dyngames.api;

import lombok.Getter;
import org.bukkit.entity.Player;

public class User {

    @Getter
    private final Player player;
    @Getter
    private final String username;
    @Getter
    private final int level;

    public User(Player player) {
        this.player = player;
        this.username = player.getName();
        this.level = 0; // TODO: Get and store info in db of some sort
    }

    public void sendMessage(String message, Object... replacements) {
        message = String.format(message, replacements);
        this.getPlayer().sendMessage(message);
    }
}
