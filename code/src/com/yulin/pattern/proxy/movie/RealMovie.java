package com.yulin.pattern.proxy.movie;

public class RealMovie implements Movie {

    @Override
    public void play() {
        System.out.println("播放电影《英雄》");
    }

}
