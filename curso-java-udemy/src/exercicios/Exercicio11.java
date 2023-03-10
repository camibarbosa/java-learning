package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		/*Com base na tabela abaixo, escreva um programa que leia o código 
		 * de um item e a quantidade deste item. A seguir, calcule e mostre 
		 * o valor da conta a pagar.*/
		
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		
		double total = 0;
	 
		if(codigo == 1) {
			total = qtd * 4.0;
		} else if(codigo == 2) {
			total = qtd * 4.5;
		} else if(qtd == 3) {
			total = qtd * 5;
		} else if(codigo == 4) {
			total = qtd * 2.0;
		} else if(codigo == 5) {
			total = qtd * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}
}
