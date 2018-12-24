package com.practice.patterns.singleton;

public class StaticBlockSingleton {

}
class Hay{
    private    int totalAmount;
    private Hay(){}
    private static Hay hay;
    static {
	hay =new Hay();
	//may be a calling of a method is like
	//getHayAmountFromDtabase and you have to connection ad it may give an error
	// so to handle it we have to make the object in static block as we can do the error
	//handling in that case
    }

    public static Hay getHayInstance(){
	return hay;
    }
    public synchronized void addQuantity(int amount){
	this.totalAmount+=amount;
    }
    public synchronized void subtractQuantity(int amount){
	this.totalAmount-=amount;
    }
    public synchronized int getHayAmount(){
	return this.totalAmount;
    }
}
//just 1 thing modified wrt simple singleton
//now the objct is made in Static block