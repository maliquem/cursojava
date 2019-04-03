package application;

import java.util.Locale;
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de linhas: ");
		int n = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int j = sc.nextInt();
		
		int[][] mat = new int[n][j];
		
		System.out.println("Preencha a matriz com numeros inteiros!");
		
		for (int i = 0; i < mat.length; i++) {
			for (int k = 0; k < mat[i].length; k++) {
				mat[i][k] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um numero inteiro presente na matriz: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int k = 0; k < mat[i].length; k++) {
				if (mat[i][k] == num) {
					System.out.println("Position: " + i + "," + k);
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][k]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][k]);
					}
					if (k > 0) {
						System.out.println("Left: " + mat[i][k-1]);
					}
					if (k < mat[i].length-1) {
						System.out.println("Right: " + mat[i][k+1]);
					}
				}
			}
		}
		
		sc.close();
	}

}
