package exercicios.matriz;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
	/*Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M
	 * linhas por N colunas contendo números inteiros, podendo haver repeticões. Em seguida,
	 * ler um número inteiro X que pertence a matriz. Para cada ocorrencia de X, mostrar os valores
	 * a esquerda, acima, a direita e abaixo de X, quando houver.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter quantity of row:");
		int m = sc.nextInt();
		 System.out.println("Enter quantity of columns:");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + matrix[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matrix[i-1][j]);
					}
					if (j < matrix[i].length-1) {
						System.out.println("Right: " + matrix[i][j+1]);
					}
					if (i < matrix.length-1) {
						System.out.println("Down: " + matrix[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
