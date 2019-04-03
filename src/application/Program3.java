package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit? (y/n): ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Enter inital deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		//System.out.println("Account info:");
		System.out.println(account.toString());
		System.out.print("Enter a deposit value: ");
		double ammount = sc.nextDouble();
		account.deposit(ammount);
		System.out.println(account.toString());
		System.out.print("Enter a value to withdrawn: ");
		ammount = sc.nextDouble();
		account.withdrawn(ammount);
		System.out.println(account.toString());
		
		sc.close();
	}

}
