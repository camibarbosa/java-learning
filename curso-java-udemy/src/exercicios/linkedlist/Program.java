package exercicios.linkedlist;

public class Program {
	public static void main(String[] args) {
		//cadastrar dados
		ListaLigada lista = new ListaLigada();
		lista.adicionar("AM");
		lista.adicionar("CE");
		lista.adicionar("PB");
		lista.adicionar("SP");
		lista.adicionar("RJ");
		System.out.println("Tamanho: " + lista.getTamanho());
		
		System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
		System.out.println("Ultimo: " + lista.getUltimo().getValor());
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}
	
		//removendo o estado
		lista.remover("CE");
		System.out.println("Removeu estado CE");
		
		lista.adicionar("AL");
		System.out.println("Adicionou estado AL");
		
		lista.remover("PB");
		lista.remover("AL");
		lista.remover("RJ");
		lista.remover("SP");
		lista.remover("AM");
		System.out.println("Tamanho: " + lista.getTamanho());
		
		lista.adicionar("MG");
		System.out.println("Adicionou estado MG");
		System.out.println("Tamanho: " + lista.getTamanho());
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}

		
	}
}
