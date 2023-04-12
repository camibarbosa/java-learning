package exercicios.linkedlist;

public class ListaLigada {
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;
	
	//método construtor
	public ListaLigada() {
		this.tamanho = 0; //quando criar a lista o tamanho é 0
	}
	
	public Elemento getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionar(String novoValor) {
		Elemento novoElemento = new Elemento(novoValor);
		if(this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			//se o primeiro elemento nao for nulo, o método adiciona o novo elemento
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}
	
	public void remover(String novoValor) {
		
	}
	
	public Elemento get(int posicao) {
		Elemento atual = this.primeiro;
		for(int i = 0; i <= posicao; i++) {
			//se o atual for diferente de null, há um proximo elemento
			if(atual.getProximo() != null) {
				atual = atual.getProximo(); //o atual vai ser atual dele msm
			}
		}
		return atual;
	
	}
	
	
}
