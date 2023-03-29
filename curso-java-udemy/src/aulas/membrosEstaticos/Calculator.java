package aulas.membrosEstaticos;

public class Calculator {
	
	//final: serve para falar que é um valor constante que nao muda
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
