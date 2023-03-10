package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int resto = num % 2;
		
		if(resto == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();		
	}
}
