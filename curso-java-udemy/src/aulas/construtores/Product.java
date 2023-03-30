package aulas.construtores;

public class Product {
	// atributos da classe
	public String name; //obj
	public double price;
	public int quantity;
	
	//método construtor - com argumentos
	public Product(String name, double price, int quantity) {
		this.name = name; //this.name - atribui ao nome do objeto
		this.price = price;
		this.quantity = quantity;
	}

	// método que volta valor total do estoque
	public double totalValueInStock() {
		return price * quantity;
	}

	// método para adicionar produtos ao estoque
	public void addProducts(int quantity) {
		this.quantity += quantity; // somar o quantity que veio como argumento no atributo da classe
	}

	// metodo para remover produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// formatando classe
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) // formatando price
				+ ", " + quantity + " units. Total: $ " + String.format("%.2f", totalValueInStock());
	}
}
