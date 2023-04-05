package aulas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//vetor tipo referencia
		Product[] vect = new Product[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price); //posicao i do vetor aponta para o novo produto 
			}
		
		double sum = 0.0;
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length; //o length é o tamanho total do vetor
		
		System.out.printf("AVARAGE PRICE = %.2f%n", avg);	
		
		sc.close();
	}
}
