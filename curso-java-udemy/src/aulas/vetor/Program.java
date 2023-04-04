package aulas.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		/*Fazer um programa para ler um número inteiro N e a altura de N
pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
altura média dessas pessoas.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//[] - declarando um vetor
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			//vect na posicao i
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i]; //percorre o vetor e acumula a soma de todo os numeros da variavel sum
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();
	}
}
