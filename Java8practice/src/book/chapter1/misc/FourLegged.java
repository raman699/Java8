package book.chapter1.misc;


import book.chapter1.misc.FourLegged.MissRhino.ChildRhino;

public class FourLegged{
    String walk="walk,";

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



    }
}