package com.practice.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

//to check reassigning of variable e
public class MultiCatch2 {

    public static void main(String[] args) {
	//this is allowed
	try{
	    throw new IOException();
	}
	catch(Exception e){
	    e= new RuntimeException();
	}

    }
    public static void check(){
	//this is not allowed
	// reassigning of e variable
	try {
	    File f=new File("test");
	    BufferedReader br =new BufferedReader(new InputStreamReader(new FileInputStream(f)));
	    throw new SQLException("test");
	}catch(IOException | SQLException e){
	    e= new Exception();
	}
    }

}
