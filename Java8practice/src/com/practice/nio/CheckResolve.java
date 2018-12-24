package com.practice.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CheckResolve {

    public static void main(String...s){
	//	Path path1 = Paths.get("/pets/..cat.txt");
	//	Path path2 = Paths.get("./dog.txt");
	//	System.out.println(path1.resolve(path2));
	//	System.out.println(path2.resolve(path1));
	//	Path path3 = Paths.get("/turkey/food");
	//	Path path4= Paths.get("tiger/cage");
	//	System.out.println(path3.resolve(path4));
	//	System.out.println(path4.resolve(path3));
	Path path5 = Paths.get("../turkey/food");

	Path path6= Paths.get("./tiger/cage");
	System.out.println(path5.resolve(path6));
	System.out.println(path6.resolve(path5));
	System.out.println(path5.isAbsolute());
    }

}
