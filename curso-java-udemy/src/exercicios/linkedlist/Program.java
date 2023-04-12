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
		
		for(int i = 0; i < lista.getTamanho(); i++) {
			System.out.println(lista.get(i).getValor());
		}

		
	}
}
