package com.library;

import java.nio.file.Path;
import java.nio.file.Paths;

public class MainUtilities {
    public static String getRootDirectory(){
        Path currentRelativePath = Paths.get("");
        return currentRelativePath.toAbsolutePath().toString();
    }
}
