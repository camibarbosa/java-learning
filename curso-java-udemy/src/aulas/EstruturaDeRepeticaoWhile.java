package aulas;

import java.util.Scanner;

public class EstruturaDeRepeticaoWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int soma = 0;
		while(num != 0) {
			soma = soma + num; //soma os valores digitados enquanto o numero digitado nao for igual a zero
			num = sc.nextInt();
		}
		System.out.println(soma);
		
		sc.close();
	}
}
