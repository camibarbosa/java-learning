package aulas.construtores;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*Fazer um programa para ler os dados de um produto em estoque (nome, preço e
	quantidade no estoque). Em seguida:
	Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)
	Realizar uma entrada no estoque e mostrar novamente os dados do produto
	Realizar uma saída no estoque e mostrar novamente os dados do produto*/

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		//obriga o programador a informar os dados do produto no momento da instaciação dele.
		//serve para proteger caso o programador criar um produto que nao tenha nome, preço etc.
		Product product = new Product(name, price, quantity);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity); //atualiza a quantidade dentro do obj product - adicionando produtos
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity); //removendo produtos
		System.out.println("Update data: " + product);
		
		sc.close();
		
	}
}
