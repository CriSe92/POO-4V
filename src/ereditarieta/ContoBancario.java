package ereditarieta;

public class ContoBancario {
	private String numero;
	private double saldo=0;

	public ContoBancario(String numero) {
		this.numero = numero;
	} // Costruttore 1

	public ContoBancario(String numero, double saldo) {
		if (saldo <= 0) throw new RuntimeException();
		this.numero = numero; this.saldo=saldo;
	} // Costruttore 2
	
	public String conto() { return numero; }   // Metodi
	
	public double saldo() { return saldo; } // getter
	
	public void setsaldo(double saldo) {this.saldo=saldo;}
	
	public void deposita(double quanto) {
		if (quanto <= 0) throw new RuntimeException();
		saldo+=quanto;
	} // deposita
	
	public boolean preleva(double quanto) {
		if (quanto <= 0) throw new RuntimeException();
		if (quanto > saldo) return false;
		saldo-=quanto;
		return true;
	} // preleva
	
	public String toString() {
		return "Conto n. "+numero + " Saldo: " + String.format("%1.2f", saldo);
	} // toString

} // ContoBancario

