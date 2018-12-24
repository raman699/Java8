package com.practice.threading.usingthread;

public class ThreadMake1 extends Thread{

    @Override
    public
    void run(){
	System.out.println("hello");
    }
    public static void main(String[] args) {
	new ThreadMake1().start();
	//the following will not make a new thread it will just run the run method once
	new ThreadMake1().run();

    }

}
//if u don't give the definition of run method it will call that of thread class
// there it will see that the target object is null or not  ,if null then donot do anything