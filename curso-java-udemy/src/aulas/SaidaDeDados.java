package aulas;

import java.util.Locale;

public class SaidaDeDados {
	public static void main(String[] args) {
		double x = 10.252314;
		System.out.printf("%.2f%n", x);  //padrão de formatação para delimitar casas decimais
		Locale.setDefault(Locale.US); //configura a localização do programa
		System.out.printf("%.2f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		/*CONCATENANDO VARIOS ELEMENTOS
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 * */
		
		String nome = "Jennie";
		int idade = 25;
		double renda = 4290.90;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		System.out.println("*************************");
		//EXERCÍCIO
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 21;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.213948;
		
		
		System.out.printf("Products: %s, which price is $ %.2f%n", product1, price1);
		
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		
		System.out.printf("Measue with eight decimal places: " + measure);
		
		System.out.printf("%nRouded (three decimal places): %.3f%n", measure);
		
		System.out.printf("US decimal point: %.3f", measure);
		
		
	}
}

