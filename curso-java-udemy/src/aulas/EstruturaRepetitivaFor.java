package aulas;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		int soma = 0;
		//estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
		for(int i = 0; i < numero; i++) { 
			int x = sc.nextInt();
			soma += x;
			
		}
		System.out.println(soma);
		
		System.out.println("----------------------");
		
		//Contagem regressiva
		 for(int y = 4; y >= 0; y--){
		 	System.out.println("Valor de i: " + y);
		}
				
		sc.close();
	}
}
