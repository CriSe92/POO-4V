package esempi;

import java.time.LocalDate;

public class Fattura {
	private Cliente destinatario;
	private int numero;
	private String descrizione;
	private double qta;
	private double prezzoUnitario;
	private LocalDate data;
	
	public Fattura(Cliente dest) {
		data = LocalDate.now();
		destinatario = dest;
	}
}
