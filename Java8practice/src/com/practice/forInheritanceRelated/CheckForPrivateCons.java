package com.practice.forInheritanceRelated;

public class CheckForPrivateCons {

    private CheckForPrivateCons(){}
}
class Check extends CheckForPrivateCons{}
//Not possible because the implict super constructor is not visible