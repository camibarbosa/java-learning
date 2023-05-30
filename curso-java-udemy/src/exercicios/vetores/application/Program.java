package exercicios.vetores.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.vetores.entities.Rent;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent r = new Rent("Maria", "maria@gmail.com");
		
		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();	
			System.out.print("E-mail: ");
			String email = sc.next();
			System.out.println("Room: ");
			int roomNum = sc.nextInt();
			
			//instanciando um obj e atribuindo uma referencia dele para um vetor na posicao roomNum
			vect[roomNum] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
			
		sc.close();
	}
}
