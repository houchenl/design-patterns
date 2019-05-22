package com.yulin.pattern.composite.file;

public class Client {

    public static void main(String[] args) {
        // 先创建文件结构
        Folder secondFolder = new Folder("second dir");
        secondFolder.add(new VideoFile("love.mp4"));
        secondFolder.add(new ImageFile("mountain.jpg"));
        secondFolder.add(new TextFile("rich.pdf"));

        Folder rootFolder = new Folder("root dir");
        rootFolder.add(new TextFile("novel.txt"));
        rootFolder.add(new ImageFile("blue.png"));
        rootFolder.add(secondFolder);

        // 展示
        secondFolder.display();
        rootFolder.display();
    }

}
