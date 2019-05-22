package com.yulin.pattern.composite.file;

public class TextFile extends File {

    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("display text file " + this.getName());
    }

}
