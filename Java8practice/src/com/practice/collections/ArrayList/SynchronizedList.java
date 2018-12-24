package com.practice.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import static  java.util.Collections.SynchronizedRandomAccessList;

public class SynchronizedList {

    public static void main(String...s){
	List l=Collections.synchronizedList(new ArrayList());
	//it  returns a reference of SynchroonizedRandomAccessList or just SynchronizedList
	System.out.println("kkjk"+l.hashCode());
	if(l instanceof ArrayList ){
	    System.out.println("yes");
	}
	if(l instanceof List ){
	    System.out.println("lidt");
	}

	if(l instanceof Collections.SynchronizedRandomAccessList){
	    System.out.println("SRAL");
	}

    }
}
