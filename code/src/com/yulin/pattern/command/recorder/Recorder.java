package com.yulin.pattern.command.recorder;

// 接收者角色，由录音机类扮演
public class Recorder {

    public void play() {
        System.out.println("播放...");
    }

    public void rewind() {
        System.out.println("倒带...");
    }

    public void stop() {
        System.out.println("停止...");
    }

}
