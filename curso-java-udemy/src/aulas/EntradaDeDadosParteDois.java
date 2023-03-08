package aulas;

import java.util.Scanner;

public class EntradaDeDadosParteDois {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*Quando vc usa um comando de leitura diferente do nextLine() 
		 * e dá alguma quebra de linha essa quebra de linha fica "pendente"
		 * na entrada padrão.
		 * 
		 * Se vc então fizer um nextline(), aquela quebra de linha pendente
		 * será absorvida pelo nextLine() 
		 * 
		 * */
		
		//quebra de linha pendente
		int x;
		
		String s1, s2, s3;
		
		x = sc.nextInt();
		// A solução é fazer um nextLine() extra antes de fazer o nextLine() de interesse
		sc.nextLine();
		
		//Quebra de linha
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}
}

    
