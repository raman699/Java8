package com.practice.interfaces;

public interface OverdingMethodsInInterfaces {

    void check();
}
interface CheckOverdingMethodsInInterfaces extends OverdingMethodsInInterfaces{
    @Override
    void check();

}
//allowed copying same method
//so we can also omit this ,i think it is of no use