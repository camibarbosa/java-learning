package exercicios.vetores5;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*Faça um programa que leia N números reais e armazene-os em um vetor. 
		 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). 
		 * Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero). */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posicao;
		
		System.out.print("Quantos numeros voce quer digitar? ");
		n = sc.nextInt();
		
		double vetor[] = new double[n];
	
		System.out.println("Digite os numeros: ");
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double maior = vetor[0];
		posicao = 0;
		
		/*o código compara cada elemento do vetor com o valor armazenado na variável "maior". 
		 * Se o elemento atual for maior do que o valor armazenado em "maior", o código atualiza
		 * o valor da variável "maior" com o elemento atual e armazena a posição deste elemento no 
		 * vetor na variável "posicao".*/		
		for(int i = 0; i < n; i++) {
			if(vetor[i] > maior) {
				maior = vetor[i];
				posicao = i;
			}
		}
		/* as variáveis "maior" e "posicao" contêm o valor do maior elemento do vetor 
		 * e a posição dele no vetor, respectivamente.*/
		
		 System.out.printf("MAIOR VALOR = %.1f\n", maior);
		 System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
		
		sc.close();
	}
}
