package com.practice.concurrentAPI;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class CheckBlockingQ3 {

    public static void main(String...s) throws InterruptedException
    {

	BlockingDeque<Integer> blockingQueue= new LinkedBlockingDeque();
	blockingQueue.offer(103);
	blockingQueue.offerFirst(20, 1, TimeUnit.SECONDS);
	blockingQueue.offerLast(85, 7, TimeUnit.HOURS);
	System.out.println(blockingQueue.pollFirst(200, TimeUnit.NANOSECONDS));
	System.out.println(blockingQueue.pollLast(1, TimeUnit.MINUTES));
    }
}
