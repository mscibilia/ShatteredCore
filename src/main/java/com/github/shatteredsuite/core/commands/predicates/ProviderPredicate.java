package com.github.shatteredsuite.core.commands.predicates;

import com.github.shatteredsuite.core.commands.responses.PredicateResponse;
import com.github.shatteredsuite.core.context.CommandContext;

import java.util.function.Function;

public class ProviderPredicate extends CommandContextPredicate {

    Function<CommandContext, Boolean> testFunction;

    public ProviderPredicate(PredicateResponse response, Function<CommandContext, Boolean> testFunction) {
        super(response);
        this.testFunction = testFunction;
    }

    @Override
    public boolean test(CommandContext context) {
        return testFunction.apply(context);
    }
}
