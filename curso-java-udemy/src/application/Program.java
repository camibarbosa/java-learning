package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		/*Exemplo de programa orientado a objeto
		 * 
		 *Fazer um programa para ler as medidas dos lados de dois triângulos X e Y 
		 *(suponha medidas válidas). Em seguida, mostrar o valor das áreas dos dois 
		 *triângulos e dizer qual dos dois triângulos possui a maior área.
		 *A fórmula para calcular a área de um triângulo a partir das medidas de seus 
		 *lados a, b e c é a seguinte (fórmula de Heron). */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;
		
		Triangle x, y;
		x = new Triangle(); //para que o obj exista e seja usado é preciso instanciar o obj
		y = new Triangle();
		
		
		System.out.println("Enter the measures of tiangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measures of tiangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//x.a - a acessando cada atributo do obj x
		double p = (x.a + x.b + x.c) / 2.0;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		p = (y.a + y.b + y.c) / 2.0;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.printf("Traingle X area: %.4f%n", areaX);
		System.out.printf("Traingle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
		
	}
}
