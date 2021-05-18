module com.example.javadocmodulepath.requiresautomatic {
    exports com.example.javadocmodulepath.requiresstatictransitive;

    // javadoc fails for modules specified by 'requires static transitive'
    // It does not matter whether the specified modules are full or automatic modules
    requires static transitive org.checkerframework.checker.qual; // Automatic module
    requires static transitive org.hsqldb; // Full module
}
