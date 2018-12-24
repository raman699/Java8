package com.practice.misc;

import java.util.ArrayList;
import java.util.Scanner;

public class MovementCheck
{
    static ArrayList<String> al;
    public static void main(String...s)
    {
	Scanner sc= new Scanner(System.in);
	al= new ArrayList<String>();
	int n=sc.nextInt();
	int m=sc.nextInt();
	int qn=sc.nextInt();
	int i=0;
	for(i=0;i<n;i++)
	{
	    al.add(sc.next());
	}
	for(i=0;i<m;i++)
	{
	    move();
	}
	System.out.print(al);

    }
    private static void move()
    {
	String tmp=al.get(0);
	for(int i=0;i<al.size()-1;i++)
	{
	    al.set(i,al.get(i+1));
	}
	al.set(al.size()-1, tmp);
    }
}
