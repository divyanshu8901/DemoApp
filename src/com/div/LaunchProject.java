package com.div;

import java.util.Scanner;

abstract class Shapes
{
	float area;
	abstract public void input();
	abstract public void compute();
	public void display()
	{
		System.out.println("Area is "+area);
		System.out.println();
	}
}

class Rectangle extends Shapes
{
	float length;
	float breadth;
	public void input()
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of length : ");
		length = sc.nextFloat();
		
		System.out.println();
		
		System.out.print("Enter the value of breadth : ");
		breadth = sc.nextFloat();
		//sc.close();
		
	}
	public void compute()
	{
		area = length * breadth;
	}
}
class Square extends Shapes
{
	float length;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of length : ");
		length = sc.nextFloat();
	
		
	}
	public void compute()
	{
		area = length *length;
		
	}
}

class Circle extends Shapes
{
	final float pi = 3.14f;
	float radius;
	public void input()
	{

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of radius : ");
		radius = sc.nextFloat();
	}
	public void compute()
	{
		area = pi*radius*radius;
	}
}

class Geometry
{
	public void permit(Shapes s)
	{
		s.input();
		s.compute();
		s.display();
	}
}
public class LaunchProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Square ss = new Square ();
		Circle c = new Circle();
		
		Geometry g = new Geometry();
		g.permit(r);
		g.permit(ss);
		g.permit(c);
		
				

		
	}

}
