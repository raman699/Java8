package com.practice.threading.usingExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ESCheck1 {

    public static void main(String[] args) {

	ExecutorService service=null;
	try{
	    service =Executors.newSingleThreadExecutor();
	    System.out.println("begin");
	    service.execute(()->System.out.println("printin zoo inventory"));
	    service.execute(()->{
		for(int i=0;i<3;i++) {
		    System.out.println("Printing records:" +i);
		}
	    });
	    service.execute(()->System.out.println("Printing zoo inventory 2"));
	    System.out.println("end");
	}
	finally{
	    if(service!=null) {
		service.shutdown();
	    }
	}

    }

}
