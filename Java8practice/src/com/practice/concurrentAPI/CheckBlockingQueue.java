package com.practice.concurrentAPI;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class CheckBlockingQueue {

    public static void main(String...s){
	try{
	    BlockingQueue<Integer> blockingQueue= new LinkedBlockingQueue();
	    blockingQueue.offer(39);
	    blockingQueue.offer(3, 1, TimeUnit.MINUTES);
	    System.out.println(blockingQueue);
	    System.out.println(blockingQueue.poll());
	    System.out.println(blockingQueue.poll(10,TimeUnit.MILLISECONDS));

	}catch(Exception e){
	    e.printStackTrace();
	}
    }
}
// the waiting time is only considered if necessary like creating space  in the queue