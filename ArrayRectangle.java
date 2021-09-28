package com.home;

import java.util.Scanner;

public class ArrayRectangle 
{
	private int width;
	private int breadth;
	public ArrayRectangle(int w,int b)
	{
		width=w;
		breadth=b;
		
	}
	public int getArea()
	{
		return width*breadth;
	}
	public static void main(String[] args)
	{
		ArrayRectangle[] r=new ArrayRectangle[3];
		r[0]=new ArrayRectangle(2,4);
		r[1]=new ArrayRectangle(5,4);
		r[2]=new ArrayRectangle(2,8);
		char choice;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the option to print getArea as y/Y");
		System.out.println("enter the option to not print getArea as n/N");
		choice=s.next().charAt(0);
		if(choice=='y'||choice=='Y')
		{	
			for (int i=0;i<3;i++)
			{
				System.out.println("Area=:"+r[i].getArea());
			}
		}
		if(choice=='n'||choice=='N')
		{
			System.out.println("you selected not to print sorry");
		}
		
	}
}
