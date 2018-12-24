package book.chapter1;

import book.chapter1.FourLegged.MissRhino.ChildRhino;


public class FourLegged{
    String walk="walk,";
    static String check="check";
    static  class BabyRhino extends FourLegged{
	String walk="toddle,";
    }
    class MissRhino  {
	String walk="ramp";
	class ChildRhino {}
    }
    public void makeObjectOfmemebrClass(){
	MissRhino missRhino = new MissRhino();
    }
    public static void main(String...s){
	FourLegged f =new FourLegged();
	f.makeObjectOfmemebrClass();
	//this is one way of making an instance of member class
	//another way of making an instance of member class is
	MissRhino missRhino1 =f.new MissRhino();
	FourLegged.MissRhino missRhino2 =f.new MissRhino();
	//MissRhino missRhino3 =new MissRhino();
	//the data type is not necessary but the right syntax is neccessary
	ChildRhino childRhino =missRhino1.new ChildRhino();


	FourLegged f1= new BabyRhino();
	FourLegged.BabyRhino babyRhino2 =f.new BabyRhino();
	//BabyRhino babyRhino3 =f.new BabyRhino();
	BabyRhino babyRhino4 =new BabyRhino();
	System.out.println(f1.check);
	System.out.println(f1.walk);
	//System.out.println(b.walk);
    }
}