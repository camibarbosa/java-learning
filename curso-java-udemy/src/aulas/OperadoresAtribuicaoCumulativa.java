package aulas;

import java.util.Locale;
import java.util.Scanner;

public class OperadoresAtribuicaoCumulativa {
	public static void main(String[] args) {
		/*Uma operadora de telefonia cobra R$ por um plano básico
		 * que da direito a 100min de telefone. Cada minuto que exceder
		 * a franquia de 100min custa R$2.00. Fazer um programa para ler
		 * a quantia de min que uma pesssoa consumiu, e mostrar o valor 
		 * a ser pago*/
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		double conta = 50.0;
		if(minutos > 100) {
			//conta = conta + (minutos - 100) * 2.0;
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		
		
		sc.close();
	}
}
