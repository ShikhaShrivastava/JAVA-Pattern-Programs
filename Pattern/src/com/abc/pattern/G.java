package com.abc.pattern;

import java.util.Scanner;

public class G {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		  System.out.println("Enter the size");
		  int n=scan.nextInt();
		  
		  for(int i=0;i<=n-1;i++)
		  {
			  for(int j=0;j<=n-1;j++)
			  {
				if((i==0&& (j>0&& j<n))||(i==n-1&&(j>0&& j<n/2)) ||(i==n/2&& (j>n/2&& j<=n))|| (j==0&& i>0&& i<n-1)||(j==n/2&& (i>n/2&&i<n))||(j==n-1 &&i>n/2&&i<n))
				 {
					System.out.print("*");  
				 } 
				else
				 {
					System.out.print(" ");  
				 }
			  }
			  System.out.println();
		  }


	}

}
