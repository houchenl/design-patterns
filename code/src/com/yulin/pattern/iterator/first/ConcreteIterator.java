package com.yulin.pattern.iterator.first;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {

    private List list = new ArrayList();
    private int cursor = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return list.get(cursor++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (cursor == list.size()) {
            return false;
        }
        return true;
    }

}
