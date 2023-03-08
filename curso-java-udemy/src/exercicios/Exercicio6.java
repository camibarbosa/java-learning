package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto 
		 * flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
			a) a área do triângulo retângulo que tem A por base e C por altura.
			b) a área do círculo de raio C. (pi = 3.14159)
			c) a área do trapézio que tem A e B por bases e C por altura.
			d) a área do quadrado que tem lado B.
			e) a área do retângulo que tem lados A e B.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo = A * C / 2.0;
		double circulo = 3.14159f * C * C;
		double trapezio = (A + B) / 2.0 * C;
		double quadrado = B * B;
		double retangulo = A * B;
		
		System.out.printf("TRIANGULO = %.4f%n", triangulo);
		System.out.printf("CIRCULO = %.4f%n", circulo);
		System.out.printf("TRAPEZIO = %.4f%n", trapezio);
		System.out.printf("QUADRADO = %.4f%n", quadrado);
		System.out.printf("RETANGULO = %.4f%n", retangulo);
		
		sc.close();
		
	}
}
