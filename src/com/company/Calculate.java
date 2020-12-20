package com.company;

public interface Calculate<T extends Number>  {
    void plus(T first);
    void minus(T first);
}
