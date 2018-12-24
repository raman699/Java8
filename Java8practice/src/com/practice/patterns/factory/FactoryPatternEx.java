package com.practice.patterns.factory;

public class FactoryPatternEx {
    public static void main(String...s) throws Exception{
	String month="May";
	Fruit f;
	switch (month){
	case "May" : f= new Mango();
	break;
	case "June" : f= new Watermelon();
	break;
	case "January" : f = new Apple();
	default : throw new Exception();
	}
    }
}
class Fruit{

}
class Mango extends Fruit{}
class Apple extends Fruit{}
class Watermelon extends Fruit{}

//A factory pattern allows  different objects at run time depending on the condition