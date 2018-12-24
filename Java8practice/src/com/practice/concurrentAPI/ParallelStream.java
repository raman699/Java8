package com.practice.concurrentAPI;

import java.util.Arrays;

public class ParallelStream {

    private String searchComponentController;
    public String getSearchComponentController() {
	return searchComponentController;
    }
    public void setSearchComponentController(String searchComponentController) {
	this.searchComponentController = searchComponentController;
    }
    public static void main(String...s){
	System.out.println(Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.reduce(0, (a,b)->(a-b)));
	System.out.println(Arrays.asList("w","o","l","f")
		.parallelStream()
		.reduce("X", String::concat)
		);
    }
}
