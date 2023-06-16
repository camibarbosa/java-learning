package exercicios.matrizes;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		/*Faça um programa para ler um número inteiro N e uma matriz
		 * de ordem N contendo números inteiros. Em seguida, mostrar a 
		 * diagonal principal e a quantidade de valores negativos da matriz*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		//[][] - indica que é arranjo bidimensional
	
		//dois for percorrem a matriz inteira
		for (int i = 0; i < matriz.length; i++) {//percorre linha
			for (int j = 0; j < matriz[i].length; j++) {//percorre coluna
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}
}
