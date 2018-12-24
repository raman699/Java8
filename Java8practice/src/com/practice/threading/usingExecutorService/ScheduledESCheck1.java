package com.practice.threading.usingExecutorService;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledESCheck1 {

    public static void main(String...s) throws InterruptedException, ExecutionException{
	ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
	Runnable task1=()->System.out.println("From task1");
	Callable<String> task2=()->"From task 2";
	System.out.println("begin");
	Future<?> result2=service.schedule(task2, 8, TimeUnit.SECONDS);
	Future<?> result1=service.schedule(task1, 10, TimeUnit.SECONDS);
	System.out.println(result2.get().toString());
	System.out.println("end");
    }
}
