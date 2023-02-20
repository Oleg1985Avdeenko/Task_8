package org.example.service;

public interface AnimalService<T> {
    void create(T t);
    Object select(T t);
    void update(T t, T tNew);
    void delete(T t);
}
