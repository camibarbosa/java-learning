package exercicios.membrosEstaticos;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double dollarToReal(double value, double dollarPrice) {
		return value * dollarPrice * (1.0 + IOF);
	}
}
