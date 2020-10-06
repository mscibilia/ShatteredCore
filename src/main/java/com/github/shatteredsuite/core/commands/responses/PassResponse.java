package com.github.shatteredsuite.core.commands.responses;

import com.github.shatteredsuite.core.context.CommandContext;

public abstract class PassResponse implements PredicateResponse {
    @Override
    public CommandContext onSuccess(CommandContext context) {
        return context;
    }
}
