package com.practice.nestedclasses;

public class SimpleMemberClass2 {

    private String message="hi";
    private class InnerMember1{
	private void greeting(){
	    System.out.println(message);
	    System.out.println(SimpleMemberClass2.this.message);

	}
    }
    public static void main(String[] args) {
	SimpleMemberClass2 simpleMemberClass2 = new SimpleMemberClass2();
	SimpleMemberClass2.InnerMember1 innerMember1=simpleMemberClass2.new InnerMember1();
	innerMember1.greeting();
    }

}
//other way to make instance of of inner class
class CheckAccessibilty{
    public static void main(String...s){
	SimpleMemberClass2 simpleMemberClass2 = new SimpleMemberClass2();
	SimpleMemberClass2.InnerMember1 innerMember1=simpleMemberClass2.new InnerMember1();
	innerMember1.greeting();
    }
}
/*the inner class is a private member so all the rules
related to acces specifier will be applicable to inner classes also
 */
//just another thing the .class name  is made by SimpleMemberClass2$InnerMember1.class