package converterCoins;

public class Coins {
	private final String[] coins;
	private final double[] valor;
	
	// Arreglo de monedas de conversion
	public Coins() {
		this.coins = new String[]{
                "MXN - Mexican Peso",
                "USD - United States Dollar",
                "EUR - Euro",
                "JPY - Japanese Yen",
                "CAD - Canadian Dollar",
                "CNY - Chinese Yuan"
            };
		
		// Arreglo de valores de moneda
		this.valor = new double[] {
				//Monedas a valor peso
				1, //Peso Mexicano
				0.055, // Dolar
				0.050,// Euro
				7, // yen
				0.074, // Dolar Canadience
				0.38 // yuan
		};
		
	}

	public String[] getCoins() {
		return coins;
	}
	
	public double getValor(int index) {
		return valor[index];
	}
}
