package com.practice.concurrentAPI;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

public class CheckBlockingQueue2 {

    public static void main(String...s){
	try{
	    BlockingDeque<Integer> blockingQueue= new LinkedBlockingDeque();
	    blockingQueue.offer(39);
	    blockingQueue.offer(3, 1, TimeUnit.MINUTES);
	    blockingQueue.offerFirst(91);
	    blockingQueue.offerFirst(121, 1, TimeUnit.MINUTES);
	    blockingQueue.offerLast(2341, 1, TimeUnit.MINUTES);
	    blockingQueue.push(233);//push adds to the left side
	    // and offer adds to the front side
	    blockingQueue.offer(391);
	    System.out.println(blockingQueue);
	    System.out.println(blockingQueue.poll());
	    System.out.println(blockingQueue.poll(10,TimeUnit.MILLISECONDS));
	    System.out.println(blockingQueue.pop());
	    System.out.println(blockingQueue);
	    System.out.println(blockingQueue.pollFirst());
	    System.out.println(blockingQueue.pollLast());
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
}
