package exercicios;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números 
		 * e mostre a divisão do primeiro pelo segundo. Se o denominador for igual
		 *  a zero, mostrar a mensagem "divisao impossivel.*/
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; ) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			if(n2 == 0) {
				System.out.println("Divisao impossivel");
			} else {
				double divisao = (double) n1 / n2;
				System.out.printf("%.1f%n",divisao);
			}	
		}
		sc.close();
	}
}
