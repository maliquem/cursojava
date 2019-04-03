package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Value of Triangle X: " + areaX);
		System.out.println("Value of Triangle Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Bigger area is Triangle X");
		}
		else {
			System.out.println("Bigger area is Triangle Y");
		}
		
		sc.close();
	}

}
