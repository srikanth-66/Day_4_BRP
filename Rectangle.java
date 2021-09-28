package com.home;

public class Rectangle 
{
	private double width;
	private double height;
	public Rectangle()
	{
		this(1.0,1.0);
	}
	public Rectangle (double width,double height)
	{
		this.width=width;
		this.height=height;
		
	}
	public double getArea()
	{
		return this.width*this.height;
	}
	 public double getPermeiter()
	 {
	   return 2*(this.width+this.height);
	 }
	 
	 public double getWidth()
	 {
	   return width;
	 }
	 
	 public void setWidth(double width)
	 {
	   this.width=width;
	 }
	  
	 public double getHeight()
	 {
		 return height;
	 }
	 public void setHeight(double height)
	 {
	   this.height=height;
	 }

	 public static void main(String[] args) 
	 {
		 //Rectangle r=new Rectangle();
		 Rectangle r1=new Rectangle(5,6);
		 System.out.println("width="+r1.width);
		 System.out.println("height="+r1.width);
		 System.out.println("set width="+setWidth);

		 System.out.println("Area="+r1.getArea());
		 System.out.println("perimeter="+r1.getPermeiter());

	}
}
