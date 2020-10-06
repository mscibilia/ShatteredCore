package com.github.shatteredsuite.core.predicates;

import com.github.shatteredsuite.core.context.CommandSenderContext;

public abstract class CommandSenderPredicate {
    protected abstract boolean testCommandSender(CommandSenderContext context);

}
