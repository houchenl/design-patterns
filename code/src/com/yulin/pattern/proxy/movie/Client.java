package com.yulin.pattern.proxy.movie;

/**
 * 电影是电影公司委托给影院进行播放的，但是影院可以在播放电影的时候，产生一些自己的经济收益，比如卖爆米花、可乐等，然后在影片开始结束时播放一些广告。
 * */
public class Client {

    public static void main(String[] args) {
        Movie movie = new Cinema();
        movie.play();
    }

}
