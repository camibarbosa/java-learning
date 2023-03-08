package aulas;

import java.util.Scanner;

public class EntradaDeDadosParteUm {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		String nome;
		int idade;
		double salario;
		char x;
		
		nome = sc.next();
		idade = sc.nextInt();
		salario = sc.nextDouble();
		x = sc.next().charAt(0);
		
		System.out.printf("Dados digitados: %nNome: %s %nIdade: %d %nSalario: %.2f%n", nome, idade, salario);
		
		System.out.println("Você digitou: " + x);
		
		sc.close();
	}

}