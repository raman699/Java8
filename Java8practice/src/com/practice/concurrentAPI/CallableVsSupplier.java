package com.practice.concurrentAPI;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class CallableVsSupplier {

    public static void useCallable(Callable<Integer> exp){}
    public static void useSupplier(Supplier<Integer> exp){}
    public static void use(Callable<Integer> exp){}
    public static void use(Supplier<Integer> exp){}
    public static void main(String... s){
	useCallable(()->{throw new Exception();});
	useSupplier(()->{throw new Exception();});//giving error
	//as the call method in callable have already throws Exception in method decalration
	//but the get method in the supplier method does not.
	//the below method will also gove error
	use(()->{throw new Exception();});
	//The method use(Callable<Integer>) is ambiguous for the type CallableVsSupplier
    }
}
