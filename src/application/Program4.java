package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hospede;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Hospede[] host = new Hospede[10];
		
		System.out.print("How many rooms be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Rent #%d%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int r = sc.nextInt();
			host[r] = new Hospede(name, email);			
		}
		
		for (int i = 0; i < 10; i++) {
			if (host[i] != null) {
				System.out.println("Room #" + i + ": " + host[i].toString());
			}
			
		}
		
		sc.close();

	}

}
