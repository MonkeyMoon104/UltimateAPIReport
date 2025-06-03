package com.monkey.ultimatereport.api;

public class MissingImplementationException extends IllegalStateException {
    public MissingImplementationException() {
        super("UltimateReport non è caricato: l’API non è ancora inizializzata.");
    }
}
