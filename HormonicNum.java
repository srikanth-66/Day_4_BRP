package com.home;

import java.util.Scanner;

public class HormonicNum 
{
		public static void main(String[] args) {
			double sum=0,n,i;
			System.out.println("Please Enter the value of N:=");
			System.out.println("Enter a number:");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			for(i=1;i<=n;i++)
			{
				sum=sum+(1/i);
				if(i==1)
					System.out.println("1 + ");
				else if(i==n)
					System.out.println("1/ "+i);
				else
					System.out.println("1/ "+i);
			}
			System.out.println();
			System.out.println("THE SUM OF THIS SERIES IS:="+sum);
		}
}
