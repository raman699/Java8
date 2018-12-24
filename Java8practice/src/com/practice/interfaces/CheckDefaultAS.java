package com.practice.interfaces;

public interface CheckDefaultAS {
    default void play(){}
}
class CheckAS implements CheckDefaultAS{

    @Override
    void play(){}
    //we have to declare it public to compile
}
