package aulas.primeiroExOO;

public class Triangle {
	//classe - definição do tipo
	
	//atributos da classe
	public double a;
	public double b;
	public double c;
	
	//funcao para calcular a area | double é o tipo de dado q o método retorna
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c)); //retornando diretamente
	}	
}
