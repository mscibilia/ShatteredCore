package com.github.shatteredsuite.core.context;

import org.bukkit.entity.Player;

public class PlayerContext extends CommandSenderContext {
    public PlayerContext(Player player) {
        super(player);
    }
}
