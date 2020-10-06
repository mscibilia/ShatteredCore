package com.github.shatteredsuite.core.context;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class CommandSenderContext extends PredicateContext {
    @NotNull
    public final CommandSender sender;

    public CommandSenderContext(@NotNull CommandSender sender) {
        this.sender = sender;
    }
}
