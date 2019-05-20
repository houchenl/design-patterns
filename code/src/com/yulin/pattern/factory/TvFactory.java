package com.yulin.pattern.factory;

public class TvFactory implements Factory {

    @Override
    public Product produce() {
        return new Tv();
    }

}
