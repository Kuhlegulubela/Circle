package za.wsu.ac.s2190328087;

public class Circle {
	private double radius;
	private int x;
	private int y;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
}

import java.util.Scanner;

public class CircleApp{
	public static void main(String[] args) {
		float radius = 0; int x; int y;
		double area, circumference = 0, diameter=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of the circle:");
		radius = input.nextFloat();
		
		System.out.println("Enter the x coordinate of the circle:");
		x = input.nextInt();
		
		System.out.println("Enter the y coordinate of the circle:");
		y =input.nextInt();
		
		area = Math.PI * radius * radius;
		System.out.println("Area of the circle:" + area);
		
		circumference = 2 * Math.PI * radius;
		System.out.println("Circumference of the circle:" + circumference);
		
		diameter = 2 * radius;
		System.out.println("Diameter of the circle:" + diameter);
		
	}
	
}
