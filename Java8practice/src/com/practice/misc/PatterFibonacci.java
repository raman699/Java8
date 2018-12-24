package com.practice.misc;

import java.util.Scanner;

public class PatterFibonacci {
    public static void main(String...s)
    {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
	    for (int j=0;j<=i;j++)
	    {
		System.out.println("*");
	    }
	}
    }
}
