package com.practice.exception;

import java.sql.SQLException;

public class ReThrowing {

    public static void main(String...s){

	try{
	    throw new SQLException();
	}catch(SQLException e){
	    e.printStackTrace();
	    throw new RuntimeException();
	}
    }
}
