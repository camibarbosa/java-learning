package aulas;

import java.util.Scanner;

public class Funcoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int higher = max(num1, num2, num3);
		
		showResult(higher);
		sc.close();
	}
	
	//public é p/ que a função fique disponivel em outras classes
	//static é p/ que essa função possa ser chamada independente de se criar um obj
	public static  int max(int n1, int n2, int n3) {
		int aux;
		if(n1 > n2 && n1 > n3) {
			aux = n1;
		} else if(n2 > n3) {
			aux = n2;
		} else {
			aux = n3;
		}
		//indica que a função deve retornar o valor
		return aux;
	}
	
	//void não retorna um valor
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
	
}
