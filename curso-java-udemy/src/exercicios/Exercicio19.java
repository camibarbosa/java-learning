package exercicios;

import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1*/
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int fatorial = 1;
		
		for(int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println(fatorial);
		
		sc.close();
	}
}
