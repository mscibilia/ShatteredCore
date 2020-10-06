package com.github.shatteredsuite.core.commands.predicates;

import com.github.shatteredsuite.core.commands.responses.CancelResponse;
import com.github.shatteredsuite.core.commands.responses.PredicateResponse;
import com.github.shatteredsuite.core.context.CommandContext;

public class SenderPermissionPredicate extends CommandContextPredicate {
    public SenderPermissionPredicate(PredicateResponse response) {
        super(response);
    }

    public SenderPermissionPredicate() {
        super(new CancelResponse("no-permission"));
        this.name = "Has command permission.";
    }

    @Override
    public boolean test(CommandContext context) {
        context.contextMessages.put("permission", context.command.getPermission());
        return context.command.hasPerms(context.sender);
    }
}
