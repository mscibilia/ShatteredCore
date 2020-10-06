package com.github.shatteredsuite.core.context;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public abstract class PredicateContext {
    @NotNull
    public final HashMap<String, String> contextMessages = new HashMap<>();
}
