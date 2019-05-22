package com.yulin.pattern.composite.file;

public class VideoFile extends File {

    public VideoFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("display video file " + this.getName());
    }

}
