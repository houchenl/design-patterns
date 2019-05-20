package com.yulin.pattern.iterator.first;

public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator iterator();

}
