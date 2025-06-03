package com.monkey.ultimatereport.api;

import lombok.Setter;

public final class UltimateReportAPI {
    @Setter
    private static UltimateReportProvider provider;

    public static UltimateReportProvider get() {
        if (provider == null) {
            throw new MissingImplementationException();
        }
        return provider;
    }

    private UltimateReportAPI() {}
}
