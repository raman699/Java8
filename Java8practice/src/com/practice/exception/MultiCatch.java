package com.practice.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class MultiCatch {

    public static void main(String...s){
	//SimpleExample
	try {
	    File f=new File("test");
	    BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	    throw new SQLException("test");
	}catch(IOException | SQLException | NullPointerException e){

	}
    }
    public static void check(){
	try {
	    File f=new File("test");
	    BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(f)));

	}catch( FileNotFoundException | IOException e){

	}
    }
}
