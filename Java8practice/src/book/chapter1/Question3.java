package book.chapter1;

public class Question3 {

    public static void main(String[] args) {
	String s1="Canada";
	String s2=new String(s1);
	if(s1==s2) {
	    System.out.println("s1==s2");
	}
	if(s1.equals(s2)) {
	    System.out.println("s1.equals(s2)");
	}
	System.out.println("s1's hascode"+s1.hashCode());
	System.out.println("s2's hascode"+s2.hashCode());
    }

}
