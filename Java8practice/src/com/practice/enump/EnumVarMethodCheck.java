package com.practice.enump;

public enum EnumVarMethodCheck {
    VAR1{
	int h;
	void check(){
	    System.out.println("this is from var1");
	}
	@Override
	void check1(){
	    this.check();
	}
	@Override
	void check2() {
	    // TODO Auto-generated method stub

	}
    },VAR2{
	@Override
	void check1(){

	}

	@Override
	void check2() {
	    // TODO Auto-generated method stub

	}
    },VAR3 {
	@Override
	void check2() {
	    // TODO Auto-generated method stub

	}
    };

    public static void main(String ...s){
	EnumVarMethodCheck e=EnumVarMethodCheck.VAR1;
	EnumVarMethodCheck.VAR1.check1();

	//****************this will give error*************
	//e.check();
	//EnumVarMethodCheck.VAR1.check();
    }
    void check1(){}
    /******this abstract method defintion now is compulspry
     * for all enum constant to give**************************************/

    abstract void check2();

}
/*we cannot use the local method on its own or anywhere else for a particular enum constant except
in the common methods
We can also override the common method in any number of enum constant */