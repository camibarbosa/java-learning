package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		//Faça um programa para ler dois valores inteiros, 
		//e depois mostrar na tela a soma desses números
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		numero1 = sc.nextInt();
		numero2 = sc.nextInt();
		int soma = numero1 + numero2;
		System.out.printf("SOMA = %d", soma);
		
		sc.close();
	}
}
