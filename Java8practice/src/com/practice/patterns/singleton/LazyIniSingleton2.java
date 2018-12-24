package com.practice.patterns.singleton;

public class LazyIniSingleton2 {

}
class Food1{
    private int quantity;
    private Food1(){}
    private volatile static  Food1 food;
    public  static synchronized Food1 getFood(){
	if(food==null){
	    synchronized(Food1.class){
		if(food==null) {
		    return new Food1();
		}
	    }
	}
	return food;
    }
    public  synchronized void  addAmount(int amount){
	this.quantity+=amount;
    }
    //various data access methods
}
// in this we will not apply synchronized and we will use volatile