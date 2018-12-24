package com.practice.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckNormalize1 {

    public static void main(String...s){

	Path path =Paths.get(".").normalize();
	System.out.println("the first path "+path);
	Path path1 =Paths.get("raman").normalize();
	System.out.println("the first path "+path1);
	int count=0;
	for(int i=0;i<path.getNameCount();i++){
	    count++;
	}
	System.out.println(count);
    }
}
