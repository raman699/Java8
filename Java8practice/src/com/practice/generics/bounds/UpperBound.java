package com.practice.generics.bounds;

import java.util.ArrayList;
import java.util.List;

public class UpperBound {

    public static void main(String...s){

	List<? extends Bird> birds=new ArrayList<Bird>();
	List<? extends Bird> eagles=new ArrayList<Eagle>();
	check(birds);
	check(eagles);//this is the purpose
	birds.add(null);

	List<Eagle> eagles1=new ArrayList<Eagle>();
	eagles1.add(new Eagle());
	check(eagles1);
	birds.add(new Object());
	birds.add(new Bird());
	birds.add(new Eagle());
	birds.add(new Sparrow());
	/*actually java does not know what exactly ? extends Bird means
	 *so it will not allow any Bird or Sparrow or Eagle to get stored in it.
	 * This is sought of immutable
	 * */
    }
    static  void check(List<? extends Bird> ls){

    }
}
class Bird{}
class Sparrow extends Bird{}
class Eagle extends Bird{}