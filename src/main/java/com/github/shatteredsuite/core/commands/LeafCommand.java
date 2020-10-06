package com.github.shatteredsuite.core.commands;

import com.github.shatteredsuite.core.commands.predicates.SenderPermissionPredicate;
import com.github.shatteredsuite.core.messages.Messageable;

public abstract class LeafCommand extends WrappedCommand {
    public LeafCommand(Messageable instance, WrappedCommand parent, String label, String permission, String helpPath) {
        super(instance, parent, label, permission, helpPath);
        contextPredicates.put("permission", new SenderPermissionPredicate());
    }
}
