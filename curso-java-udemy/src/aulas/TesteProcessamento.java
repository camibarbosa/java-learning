package aulas;

public class TesteProcessamento {
	public static void main(String[] args) {
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		
		System.out.println("--------------------");
		
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		
		resultado = (double)  a / c; //casting - conversão explicita dos valores
		
		System.out.println(resultado);
		
		System.out.println("--------------------");
		
		double m;
		int n;
		
		m = 5.0;
		n = (int) m;
		
		System.out.println(n);
		
		
	}
}
