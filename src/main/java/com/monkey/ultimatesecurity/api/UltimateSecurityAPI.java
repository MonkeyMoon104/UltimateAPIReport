package com.monkey.ultimatesecurity.api;

import lombok.Setter;

public final class UltimateSecurityAPI {
    @Setter
    private static UltimateSecurityProvider provider;

    public static UltimateSecurityProvider get() {
        if (provider == null) {
            throw new MissingImplementationException();
        }
        return provider;
    }

    private UltimateSecurityAPI() {}

}
