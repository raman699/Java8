package com.practice.threading.sychronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CorrectFault1 {
    private int count=0;

    private void incrementAndReport(){
	synchronized(this){
	    System.out.println(++count+"  ");
	}}
    public static void main(String[] args) {
	ExecutorService service=null;
	try{
	    service= Executors.newFixedThreadPool(200);
	    CorrectFault1 correctFault1 = new CorrectFault1();
	    for(int i=0;i<10000;i++ )
	    {
		service.submit(()-> correctFault1.incrementAndReport());
	    }
	}
	finally {
	    if(service!=null){
		service.shutdown();
	    }
	}


    }
}
