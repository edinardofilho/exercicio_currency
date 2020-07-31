package util;

public class CurrencyConverter {
		
	public static final double IOF = 0.06;
	
	public static double amountInReais(double dollarPrice, double dollarBought) {
		return dollarPrice * (dollarBought*= (1.0 + IOF));
	}
}
