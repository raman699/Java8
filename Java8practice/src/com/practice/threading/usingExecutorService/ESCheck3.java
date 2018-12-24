package com.practice.threading.usingExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Program to show different methods of making Executor Service
 */
public class ESCheck3 {

    public static void main(String...s){

	ExecutorService es1= Executors.newSingleThreadExecutor();
	ExecutorService es2 =Executors.newSingleThreadScheduledExecutor();
	ExecutorService es3 = Executors.newCachedThreadPool();
	ExecutorService es4 =Executors.newFixedThreadPool(10);
	ExecutorService es5 =Executors.newScheduledThreadPool(10);

    }
}
