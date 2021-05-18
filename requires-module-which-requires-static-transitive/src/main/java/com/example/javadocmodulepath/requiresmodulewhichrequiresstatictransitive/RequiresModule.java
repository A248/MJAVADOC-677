package com.example.javadocmodulepath.requiresmodulewhichrequiresstatictransitive;

import com.example.javadocmodulepath.requiresstatictransitive.CheckerQualUsage;

public class RequiresModule {

    public String value() {
        return new CheckerQualUsage().value();
    }
}
