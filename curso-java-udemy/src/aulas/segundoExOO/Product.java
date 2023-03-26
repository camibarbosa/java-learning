package aulas.segundoExOO;

public class Product {
	//atributos da classe
	public String name;
	public double price;
	public int quantity; 
	
	//método que volta valor total do estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//método para adicionar produtos ao estoque
	public void  addProducts(int quantity) {
		this.quantity += quantity; //somar o quantity que veio como argumento no atributo da classe
	}
	
	//metodo para remover produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//formatando classe
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price) //formatando price
				+ ", "
				+ quantity
				+ " units. Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
