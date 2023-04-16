package converterCoins;

import javax.swing.JOptionPane;

public class Convertidor extends Coins{
	//Atributos
	private String opc;
	private double monto;
	private String monedaPrimaria;
	private String monedaSecundaria;
	private boolean counter = true;

	
	// Menu desplegable
	public String imprimirMonedas(String info) {
		opc = (JOptionPane.showInputDialog(null, info, "Coins", 
    			JOptionPane.PLAIN_MESSAGE, null, getCoins(), "Select")).toString();
    	return opc;
    }

	// Monto por convetir
	public void setMonto(double monto) {
		this.monto = monto;
		System.out.println(this.monto);
	}
	
	public double getMonto() {
		return monto;
	}

	// ****** moneda que se convertira *******
	public String getMonedaPrimaria() {
		return monedaPrimaria;
	}

	public void setMonedaPrimaria(String monedaPrimaria) {
		this.monedaPrimaria = monedaPrimaria;
		System.out.println(monedaPrimaria);
	}

	
	// ****** moneda a la que se converitra *******
	public String getMonedaSecundaria() {
		return monedaSecundaria;
	}

	public void setMonedaSecundaria(String monedaSecundaria) {
		this.monedaSecundaria = monedaSecundaria;
		System.out.println(monedaSecundaria);
	}

	// counter
	
	public boolean getCounter() {
		return counter;
	}

	public void setCounter(boolean counter) {
		this.counter = counter;
	}
	
}

