package com.practice.datetime;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DurationCheck {

    public static void main(String...s){
	String m1=Duration.of(1, ChronoUnit.MINUTES).toString();
	String m2=Duration.ofMinutes(1).toString();
	String s1= Duration.of(60, ChronoUnit.SECONDS).toString();
	String d=Duration.ofDays(1).toString();
	String p=Period.ofDays(1).toString();
	System.out.println("m1:"+m1);
	System.out.println("m2:"+m2);
	System.out.println("s1:"+s1);
	System.out.println("d:"+d);
	System.out.println("p:"+p);
	System.out.println(m1.equals(s1));

    }
}
