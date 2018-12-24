package com.practice.nestedclasses;

public class SimpleMemberClass {
    int var1=1;
    String varString;
    class NS1{
	int var1=2,var2;
	void localcheck(){
	    System.out.println("from NS1"+var1);
	}
    }
    public class NS2{
	int var1,var2;
	void localcheck(){
	    System.out.println("from NS2"+var1);
	}
    }
    protected class NS3{
	int var1,var2;
	void localcheck(){
	    System.out.println("from NS3"+var1);
	}
    }
    private class NS4{
	int var1,var2;
	void localcheck(){
	    System.out.println("from NS4"+var1);
	}
    }
    void outerCheck(){
	NS1 ns1=new NS1();
	NS2 ns2=new NS2();
	NS3 ns3=new NS3();
	NS4 ns4=new NS4();
	ns1.localcheck();
	ns2.localcheck();
	ns3.localcheck();
	ns4.localcheck();

    }
    public static void main(String[] args) {
	SimpleMemberClass simpleMemberClass =new SimpleMemberClass();
	simpleMemberClass.outerCheck();

    }
}
/*simple program to check the invocation of nested classes
this is show that the member class is also just like the member field of the class
 Also to show that priority goes to the local variables
 */
