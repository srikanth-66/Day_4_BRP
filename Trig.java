package com.home;

import java.util.Scanner;

public class Trig
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the degress or angle");
		double degree=sc.nextDouble();
		System.out.println("entered degree is="+degree);
		double radian=degree*(Math.PI/180);
		System.out.println("The given Degree is ="+radian+"  " +"radians");
		System.out.println("sin("+ degree +")="+Math.sin(degree)+" "+"Radians");
		System.out.println("cos("+ degree +")="+Math.cos(degree)+" "+"Radians");

		
	}

}
