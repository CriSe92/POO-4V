package esempi;

import java.time.LocalDate;

public class Fattura {
	//Variabili di istanza
	private Cliente destinatario;
	private int numero;
	private String descrizione;
	private double qta;
	private double prezzoUnitario;
	private LocalDate data;
	
	private static int numeroCorrente = 1;
	
	//Costruttore
	public Fattura(Cliente dest) {
		this.destinatario = dest;
		this.data = LocalDate.now();
		this.numero = numeroCorrente;
		numeroCorrente++;
	}
	
	public Fattura(Cliente dest, String descrizione, double qta, double prezzoUnitario) {
		this(dest);
		this.descrizione = descrizione;
		this.qta = qta;
		this.prezzoUnitario = prezzoUnitario;
	}
	
	public void setDescrizione(String descr) {
		this.descrizione = descr;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzoUnitario = prezzo;
	}
	
	public void setQta(double qta) {
		this.qta = qta;
	}
	
	public static int getNumeroCorrente() {
		return numeroCorrente;
	}
	
	private double calcolaImponibile() {
		return this.qta*this.prezzoUnitario;
	}
	
	private double calcolaImposta() {
		return this.calcolaImponibile()*0.22;
	}
	
	public double totaleFattura() {
		return calcolaImponibile()+calcolaImposta();
	}
	
	public void emettiFattura() {
		destinatario.addebita(totaleFattura());
	}
	
	public String toString() {
		return "Fattura n. "+numero+" del "+data+"\n"+
		"Intestata a "+destinatario+"\n"+
		"Descrizione: "+descrizione+"\n"+
		"Quantità: "+qta+"\n"+
		"Prezzo Unitario: € "+prezzoUnitario;
	}
}
