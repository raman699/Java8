package book.chapter1;

public class Question9 {
    int r;
    int j=this.j;
    //  static int h=this.j;



    public static void main(String...s){
	new OuterClass().getX();
	System.out.println(new Question9().j);

    }}
class OuterClass{
    private int x=1;
    public int getX(){
	String message="x  + is";
	class InnerClass{
	    int x=OuterClass.this.x;
	    public void printX(){
		System.out.println(message +x);
	    }

	}
	InnerClass in=new InnerClass();
	in.printX();
	return x;
    }
}