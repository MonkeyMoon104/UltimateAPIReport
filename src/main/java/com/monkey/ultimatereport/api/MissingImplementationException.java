package com.monkey.ultimatereport.api;

public class MissingImplementationException extends IllegalStateException {
    public MissingImplementationException() {
        super("UltimateReport not loaded: API still not initializated.");
    }
}
