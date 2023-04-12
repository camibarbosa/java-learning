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
		System.out.println(lista.get(0).getValor());
		System.out.println(lista.get(1).getValor());
		System.out.println(lista.get(2).getValor());
		System.out.println(lista.get(3).getValor());
		System.out.println(lista.get(4).getValor());
	
	}
}
