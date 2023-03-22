package exercicios;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio22 {
		public static void main(String[] args) {
			/*Fazer um programa para ler uma temperatura 
			 * em Celcius e mostrar o equivalente em Fahrenheit.
			 * Perguntar se o usuário deseja repetir (s/n). Caso O 
			 * usuário digite "s", repetir o programa.*/ 
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			char resp;
			do { //o bloco de comando executa pelo menos 1 vez, pois a condição é verificada no final.
				System.out.println("Digite a temperatura em Celcius: ");
				double C = sc.nextDouble();
				double F = 9.0 * C / 5.0 + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
				System.out.print("Deseja repetir (s/n)? ");
				resp = sc.next().charAt(0);
			} while(resp != 'n');
			
			
			sc.close();
		}
}