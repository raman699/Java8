package com.practice.concurrentAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Check1 {

    private int count=0;
    private void increment(){
	System.out.println(++count+" ");
    }
    public static void main(String...s){
	ExecutorService service=null;
	try{
	    service=Executors.newFixedThreadPool(20);
	    Check1 check1=new Check1();
	    for(int i=0;i<10;i++){
		service.submit(()->check1.increment());
	    }
	}finally{
	    if(service!=null) {
		service.shutdown();
	    }
	}
    }
}
