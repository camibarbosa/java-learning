package aulas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {
		
		//List nao aceita numeros primitivos (int)
		//Para declarar uma interface é necessario colocar uma classe
		//que implementa a interface (ex: ArrayList)
		List<String> list = new ArrayList<>();
		list.add("Chuu");
		list.add("Mingi");
		list.add("Jackson");
		list.add("Chan");
		list.add("Yoongi");
		list.add("Jennie");
		
		//adicionando um elemento na posição 2
		list.add(2, "Lee Know");
		
		//método para saber o tamanho da lista
		System.out.println(list.size());
		
		/*método para remover um elemento da lista 
		list.remove(0); ou
		list.remove("Lee Know");
		*/
		
		//para cada string x pertencente a lista list
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		
		//método para remover elementos que atendam a um predicado
		list.removeIf(x -> x.charAt(0) == 'M'); //remove elementos que começam com a letra m 
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		
		//método para encontrar a posição de um elemento
		System.out.println("Index of Chuu: " + list.indexOf("Chuu"));
		//quando o indexOf nao encontra o elemento, ele retorna -1 
		

		System.out.println("-------------------------");
		//metodo para encontrar um elemento da lista que atenda um certo predicado
		//encontrar o primeiro elemento que começa com a letra J
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		System.out.println("-------------------------");
		
		//método para deixar na lista apenas elementos que começam com a letra M
		               //converte para stream //pega os elementos dessa operação      //faz o elemento voltar pra lista
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	}
}
