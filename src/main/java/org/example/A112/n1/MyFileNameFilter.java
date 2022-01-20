package org.example.A112.n1;

import java.io.File;
import java.io.FilenameFilter;

// FileNameFilter implementation
public class MyFileNameFilter implements FilenameFilter {

    private String extension;

    public MyFileNameFilter(String extension) {
        this.extension = extension.toLowerCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.toLowerCase().endsWith(extension);
    }
}