package com.practice.patterns.singleton;

public class LazyIniSingleton1 {


}
class Food{
    private int quantity;
    private Food(){}
    private static Food food;
    public synchronized static Food getFood(){
	if(food==null){
	    return new Food();
	}
	return food;
    }
    public synchronized void addAmount(int amount){
	this.quantity+=amount;
    }
    //various data access methods
}
// if you see THE GETfOOD MEHTOD MAY BE called by two diffferent processes simultaneously
//so we may have multiple Food objects now
// so make it synchronized