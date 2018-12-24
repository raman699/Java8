package com.practice.threading.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class WeighAnimalAction extends RecursiveAction {

    private int start;
    private int end;
    private Double[] weights;
    public WeighAnimalAction(Double[] weights,int start, int end){
	this.start=start;
	this.end=end;
	this.weights=weights;

    }
    @Override
    protected void compute() {
	if(end-start<=3)
	{
	    for(int i=start;i<end;i++)
	    {
		weights[i]=(double) new Random().nextInt(100);
		System.out.println("weighed :"+ i);
	    }
	}
	else
	{
	    int middle=start+((end-start)/2);
	    System.out.println("start="+start+"middle="+middle+"end="+end);
	    invokeAll(new WeighAnimalAction(weights,start,middle),
		    new WeighAnimalAction(weights,middle,end)
		    );


	}

    }
    public static void main(String...s){
	Double[] weights = new Double[10];
	ForkJoinTask<?> task = new WeighAnimalAction(weights,0,weights.length);
	ForkJoinPool pool= new ForkJoinPool();
	pool.invoke(task);

	System.out.println("weights:");
	for(int i=0;i<10;i++){
	    System.out.println(weights[i]);

	}}
}
