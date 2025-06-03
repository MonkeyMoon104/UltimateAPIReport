package com.monkey.ultimatereport.api;

import lombok.Setter;

/** Facciata statica visibile agli altri plugin. */
public final class ReportAPI {
    @Setter
    private static ReportProvider provider;

    public static ReportProvider get() {
        if (provider == null) {
            throw new MissingImplementationException();
        }
        return provider;
    }

    private ReportAPI() {}  // nessuna istanza
}
