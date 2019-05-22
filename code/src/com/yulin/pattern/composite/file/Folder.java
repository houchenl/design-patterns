package com.yulin.pattern.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends File {

    private List<File> files;

    public Folder(String name) {
        super(name);
        this.files = new ArrayList<>();
    }

    public void add(File file) {
        this.files.add(file);
    }

    public void remove(File file) {
        this.files.remove(file);
    }

    @Override
    public void display() {
        System.out.println("display dir " + this.getName());
        for (File file : this.files) {
            file.display();
        }
    }

}
