package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por hora 
		 * e calcula o salário desse funcionário. A seguir, mostre o número e 
		 * o salário do funcionário, com duas casas decimais.  */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int numeroFuncionario = sc.nextInt();
		int numeroHorasTrabalhadas = sc.nextInt();
		double salario = sc.nextDouble();
		double somaSalario = numeroHorasTrabalhadas * salario;
		System.out.printf("NUMBER = %d%n", numeroFuncionario);
		System.out.printf("SALARY = U$%.2f", somaSalario);
	
		sc.close();
	}
}
