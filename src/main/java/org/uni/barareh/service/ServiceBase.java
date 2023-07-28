package org.uni.barareh.service;

public interface ServiceBase<T> {
    Boolean add(T t);
    T find(String id);
    Boolean delete(T t);
    Boolean update(T t);

}
