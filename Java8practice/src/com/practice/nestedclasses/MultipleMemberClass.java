package com.practice.nestedclasses;

//Remember the syntax for accessing the members
public class MultipleMemberClass {

    private int x=0;
    private   class MClass1{

	private int x =1;


	private class MClass2{

	    private int x =2;


	    private class MClass3{

		private int x =3;
		void showX(){
		    System.out.println(x);
		    System.out.println(this.x);
		    System.out.println(MClass3.this.x);
		    System.out.println(MClass2.this.x);
		    System.out.println(MClass1.this.x);

		}
	    }
	}
    }
    public class MClass4{

    }
    public static void main(String...args) {

	MultipleMemberClass multipleMemberClass=new MultipleMemberClass();
	MultipleMemberClass.MClass1 mClass1=multipleMemberClass.new MClass1();
	MultipleMemberClass.MClass1.MClass2 mClass2= mClass1.new MClass2();
	MultipleMemberClass.MClass1.MClass2.MClass3 mClass3= mClass2.new MClass3();
	mClass3.showX();
	MClass1 mClass_1= multipleMemberClass.new MClass1();

	//com.practice.nestedclasses.MultipleMemberClass.MClass1.MClass2 mClass_2= mClass1.new MClass2();
	////you are defining the class type explicitly
	//MClass2 mClass_22= mClass1.new MClass2();
	/*last one is not legal
	 *java cannot get this much deep in nested class as these are private members in private members
	 *if these would have been public (or checkk for xyz ) they would be accessible in the same way
	 */
	//PS:	if MClass1 is declared public then we can access MClass2 indepently
	//Remember that the member classes have their own independent identity
	//MClass4 mClass4= new MClass4();
	//this one also illegal as outer class instance is necsseary
    }

}
