package com.github.shatteredsuite.core.commands.predicates;

import com.github.shatteredsuite.core.commands.responses.PredicateResponse;
import com.github.shatteredsuite.core.context.CommandContext;

public class IndexedChildPredicate extends CommandContextPredicate {
    private final int index;

    public IndexedChildPredicate(PredicateResponse response, int index) {
        super(response);
        this.index = index;
        this.name = "Contains valid child (" + index + ").";
    }

    @Override
    public boolean test(CommandContext context) {
        return context.args.length > index && context.command.inChildren(context.args[index]);
    }
}
