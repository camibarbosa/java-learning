package exercicios.vetores4;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	/*Faça um programa que leia N números inteiros e armazene-os em um vetor. 
	 * Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. 
	 */
	
		Scanner sc = new Scanner(System.in);
		
		int quantidade = 0;
		int n = 0;
		
		System.out.print("Quantos numeros voce quer digitar? ");
		n = sc.nextInt();
		
		int vetor[] = new int[n];
		
		System.out.println("Digite os numeros: ");
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("Numeros pares: ");
		for(int i = 0; i < n; i++) {
			if(vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
				quantidade++;
			}
		}
		
		System.out.print("Quantidade pares: " + quantidade);
			
		sc.close();

	}
}
