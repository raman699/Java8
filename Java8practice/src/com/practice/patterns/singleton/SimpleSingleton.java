package com.practice.patterns.singleton;

public class SimpleSingleton {
    public static void main(String...s){
	AnimalFood animalFood=AnimalFood.getAnimalFood();
	AnimalFood animalFood1=AnimalFood.getAnimalFood();
	//i just want to show that the reference of both the objetcs will be same
	animalFood.addFood(3);
	animalFood1.addFood(34);
	System.out.println(animalFood.getQuantity());
	System.out.println(animalFood1.getQuantity());
	//this should be same for both
	if(animalFood.subtractFood(23)){
	    System.out.println(animalFood1.getQuantity());
	}
	if(animalFood1.subtractFood(3)){
	    System.out.println(animalFood.getQuantity());
	}

	// i have deliberately chosen vice-versa in both to show you that both will work
    }

}
class AnimalFood{
    private int quantity;

    private AnimalFood(){

    }
    private static AnimalFood animalFood=new AnimalFood();

    public static AnimalFood getAnimalFood(){

	return animalFood;
    }
    public synchronized void addFood(int amount){
	this.quantity+=amount;
    }
    public synchronized boolean   subtractFood(int amount){
	if(amount>this.quantity){
	    return false;
	}
	else{
	    this.quantity-=amount;
	    return true;
	}
    }
    public synchronized int getQuantity(){
	return quantity;
    }
}

//5 things matter
//private data members
//private constructor
//private static reference variable
//public method to get the instance of reference variable
//all other methods should be synchronized (because they may contain manipulative code)