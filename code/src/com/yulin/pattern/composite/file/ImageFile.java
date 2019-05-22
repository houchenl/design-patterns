package com.yulin.pattern.composite.file;

public class ImageFile extends File {

    public ImageFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("display image file " + this.getName());
    }

}
