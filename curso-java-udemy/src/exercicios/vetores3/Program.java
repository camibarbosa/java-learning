package exercicios.vetores3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*Fazer um programa para ler nome, idade e altura de N pessoas, 
		 * conforme exemplo. Depois, mostrar na tela a altura média das pessoas, 
		 * e mostrar também a porcentagem de pessoas com menos de 16 anos, 
		 * bem como os nomes dessas pessoas caso houver.*/

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double mediaAltura, menor, percentualMenor; 
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String nomes[] = new String[n];
		int idades[] = new int[n];
		double alturas[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %d pessoa%n ", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
		}
		
		double alturaTotal = 0.0;
		for(int i = 0; i < n; i++) {
			alturaTotal += alturas[i];
		}
	
		mediaAltura = alturaTotal / n;
		System.out.printf("\nAltura media = %.2f\n", mediaAltura);
	
		menor = 0;
		for(int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				menor++;
			}
			alturaTotal += alturas[i];
		}
		
		percentualMenor =(menor / n) * 100.0;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentualMenor);
		
		for(int i = 0; i < n; i++) {
			if(idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		sc.close();
	}

}
