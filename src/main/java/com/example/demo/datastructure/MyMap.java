package com.example.demo.datastructure;

public interface MyMap<K, V> {
    V get(Object key);

    V put(Object key, Object value);

    V remove(Object key);
}
