package exercicios.vetores2;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. 
		 * Em seguida: 
		 * - Imprimir todos os elementos do vetor 
		 * - Mostrar na tela a soma e a média dos elementos do vetor  */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double vetor[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.println("VALORES: " );
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%.1f\n ", vetor[i]);
		}
		System.out.printf("SOMA: %.2f\n", soma);
		System.out.printf("MEDIA: %.2f\n", media);
		
		sc.close();
	}

}
