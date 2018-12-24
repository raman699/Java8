package com.practice.matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxCheck {
    static ArrayList<String> al = new ArrayList();
    public static void main(String...s)
    {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int colony[][]= new int[n][n];

	int i,j;
	for(i=0;i<n;i++)
	{
	    for(j=0;j<n;j++)
	    {
		colony[i][j]=sc.nextInt();
	    }
	}
	//1st row
	for(j=1;j<n;j++)
	{
	    colony[0][j]=colony[0][j]+colony[0][j-1];
	}
	//First column
	for(i=1;i<n;i++)
	{
	    colony[i][0]=colony[i][0]+colony[i-1][0];
	}
	for(i=1;i<n;i++)
	{
	    for(j=1;j<n;j++)
	    {
		colony[i][j]=max(colony[i][j-1],colony[i-1][j])+colony[i][j];
	    }
	}
	System.out.println(colony[n-1][n-1]);

	for(i=n-1;i>0;i--)
	{
	    for(j=n-1;j>0;j--)
	    {
		if(colony[i][j-1]>colony[i-1][j])
		{
		    al.add(i+","+(j-1));
		}
		else{
		    al.add(i-1+" , "+j);
		}
	    }
	}
	System.out.println(al);
    }
    private static int max(int i,int j)

    {
	return i>j?i:j;
    }
}
