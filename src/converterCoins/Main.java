package converterCoins;

import javax.swing.JOptionPane;

public class Main {
 
	static Convertidor conversion = new Convertidor();
	
	// Funcion main
	public static void main(String[] args) {
		ejecucionPrograma();
	}
	
	// Funcion de ejecucion de bloques
	public static void ejecucionPrograma() {
		int ciclo;
		do {
			seleccionMoneda();		
			montoConvertir();
			seleccionMoneda();
			impresionResultado();
			ciclo = JOptionPane.showConfirmDialog(null, "Desea hacer otra conversion");
		} while(ciclo == 0);
		
	}
	
	
	// Seleccion de moneda a convertir y moneda a la que sera convertida
	public static void seleccionMoneda() {
		if (conversion.getCounter()) {
			conversion.setMonedaPrimaria(conversion.imprimirMonedas("Seleccione la moneda a convertir"));
			 conversion.setCounter(false);
		} else {
			conversion.setMonedaSecundaria(conversion.imprimirMonedas("Seleccione la moneda de convercion"));
			conversion.setCounter(true);
		}
	}
	
	// Input de cantidad a convertir
	public static void montoConvertir() {
		try {
			conversion.setMonto(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a convertir")));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
			e.printStackTrace();
		}
	} 
	
	// Menu interno de conversion de monedas
	public static double menuDeConversion() {
		double montoConvertido = 0;
		
		switch (conversion.getMonedaPrimaria()) {
		
		case "MXN - Mexican Peso":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			
			break;
			
		case "USD - United States Dollar":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			break;
			
		case "EUR - Euro":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			break;
			
		case "JPY - Japanese Yen":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			break;
			
		case "CAD - Canadian Dollar":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			break;
			
		case "CNY - Chinese Yuan":
			montoConvertido = conversorMonedas(conversion.getMonto(), getIndexContry(conversion.getMonedaPrimaria()), getIndexContry(conversion.getMonedaSecundaria()));
			System.out.printf("%.4f", montoConvertido);
			break;
			
		}
		return montoConvertido;
	}
	
	// Funcion para conversion de monedas
	public static double conversorMonedas(double monto,int monedaPrimaria, int monedaSecundaria) {
		double moneda = 0;
		
		if(monedaPrimaria == 0) {
			moneda = conversion.getMonto() * conversion.getValor(0); // Conversion exclusiva para peso mexicano a cualquier moneda
		} else {
			moneda = conversion.getMonto() / conversion.getValor(monedaPrimaria); // Convertimos la moneda extranjera a pesos mexicanos
		}
		
		moneda *= conversion.getValor(monedaSecundaria); // Convertimos la moneda al valor deseado
		
		return moneda;
	}
	
	// Generador de index para los paises
	public static int getIndexContry (String country) {
		int index = 0;
			if(country.contains("MXN")) {
				index = 0;
			} else
				if (country.contains("USD")) {
					index = 1;
			} else
				if (country.contains("EUR")) {
					index = 2;
			} else
				if (country.contains("JPY")) {
					index = 3;
			} else
				if (country.contains("CAD")) {
					index = 4;
			} else
				if (country.contains("CNY")) {
					index = 5;
			} 
		return index;
	}
	
	public static void impresionResultado() {
		JOptionPane.showMessageDialog(null, "El tipo de cambio en "+ conversion.getMonedaSecundaria() + "es de: $"+ menuDeConversion());
	}
}
