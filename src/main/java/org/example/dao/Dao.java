package org.example.dao;

import org.example.bean.Animal;

import java.util.List;

public interface Dao<T> {

    void insert(T t);
    Object select(T t);
    void update(T t, T tNew);
    void delete(T t);
}
