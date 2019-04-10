package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;
import entities2.OutsourceEmployee;

public class Program9 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero de funcionarios a serem cadastrados: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("Ele é terceirizado? (y/n): ");
			char a = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			Integer hours = sc.nextInt();
			System.out.print("Pagamento por hora: ");
			Double valuePerHour = sc.nextDouble();
			if(a == 'y') {
				System.out.print("Cobrança adicional: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
			list.add(new Employee(name, hours, valuePerHour));
			}
		}
			
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}

}
