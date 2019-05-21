package com.yulin.pattern.proxy.movie;

// 影院，代理，在电影播放前做一些别的业务
public class Cinema implements Movie {

    private RealMovie movie;

    public Cinema() {
        this.movie = new RealMovie();
    }

    @Override
    public void play() {
        ad();
        movie.play();
    }

    private void ad() {
        System.out.println("播放广告...");
    }

}
