package com.practice.threading.usingthread;

class ThreadMake2 implements Runnable{

    @Override
    public void run(){
	System.out.println("hello");
    }
    public static void main(String...s){
	new Thread(new ThreadMake2()).start();
	//the following will not make a new thread it will just run the run method once

	new Thread(new ThreadMake2()).run();
    }
}