package org.uni.barareh.service;

import org.uni.barareh.entity.Person;

public interface ServiceBase<T extends Person> {
    Boolean add(T t);
    T find(String id);
    Boolean delete(T t);
    Boolean update(T t);

}
