package com.practice.threading.sychronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Check1Fault {

    private int count=0;

    private void incrementAndReport(){
	System.out.println(++count+"  ");
    }
    public static void main(String[] args) {
	ExecutorService service=null;
	try{
	    service= Executors.newFixedThreadPool(200);
	    Check1Fault check1Fault = new Check1Fault();
	    for(int i=0;i<1000;i++ )
	    {
		service.submit(()-> check1Fault.incrementAndReport());
	    }
	}
	finally {
	    if(service!=null){
		service.shutdown();
	    }
	}


    }

}
//ideally u should use AtomicInteger
