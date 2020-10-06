package com.github.shatteredsuite.core.commands.responses;

import com.github.shatteredsuite.core.context.CommandContext;

public interface PredicateResponse {
    CommandContext onSuccess(CommandContext context);

    CommandContext onFailure(CommandContext context);
}
