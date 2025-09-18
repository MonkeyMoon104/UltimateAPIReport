package com.monkey.ultimatesecurity.api;

public class MissingImplementationException extends IllegalStateException {
    public MissingImplementationException() {
        super("UltimateSecurity not loaded: API still not initializated.");
    }
}
