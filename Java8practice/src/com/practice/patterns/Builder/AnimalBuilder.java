package com.practice.patterns.Builder;

public class AnimalBuilder {

    private Animal animal;
    private int age ;
    private String species;
    private String foodType;
    public AnimalBuilder setAge(int age){
	this.age=age;
	return this;
    }
    public AnimalBuilder setSpecies(String species){
	this.species=species;
	return this;
    }
    public AnimalBuilder setFoodType(String foodType){
	this.foodType=foodType;
	return this;
    }
    public Animal build(){
	return new Animal(species,age,foodType);
    }
}
class Animal{
    private String species;
    private int age;
    private String foodType;
    public Animal(String species,int age,String foodType){
	this.species=species;
	this.age=age;
	this.foodType=foodType;
    }

}
//BuilderPattern is used for creation of the object at the time of instantiation
// and you cannot change  them
//and often they are discarded afer their first use