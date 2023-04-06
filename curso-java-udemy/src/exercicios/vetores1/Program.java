package exercicios.vetores1;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/**
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) 
		 * e depois N números inteiros e armazene-os em um vetor. Em seguida, 
		 * mostrar na tela todos os números negativos lidos. 
		 */	
		Scanner sc = new Scanner(System.in);
	
		int n;
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		if(n < 10) {
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("Digite um numero: ");
				vetor[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				if(vetor[i] < 0) {
					System.out.printf("NUMEROS NEGATIVOS: %d\n", vetor[i]);
				}
			}
		} else{
			System.out.println("Digite um numero menor que 10.");
			}
		
		sc.close();
	}
		 
}
