package exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar 
		 * uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se 
		 * os valores lidos são múltiplos entre si. Atenção: os números devem 
		 * poder ser digitados em ordem crescente ou decrescente.*/
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("SAO MULTIPLOS");
		} else {
			System.out.println("NAO SAO MULTIPLOS");
		}
		
		sc.close();
	}

}
