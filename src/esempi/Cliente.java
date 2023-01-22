package esempi;

public class Cliente {
	private String nome;
	private String partitaIVA;
	private double saldo; 
	
	public Cliente(String nome, String partitaIVA) {
		this.nome = nome;
		this.partitaIVA = partitaIVA;
		this.saldo = 0;
	}
	
	public Cliente(String nome, String partitaIVA, double saldo) {
		this(nome,partitaIVA);
		this.saldo = saldo;
	}
	
	public void addebbita(double importo) {
		saldo = saldo + importo;
	}
	
	public void paga(double importo) {
		saldo = saldo - importo;
	}
	
	public void stampaSituazione() {
		System.out.println("-----------------------------");
		System.out.println("Cliente: "+nome);
		System.out.println("PartitaIVA: "+partitaIVA);
		System.out.println("Saldo: € "+saldo);
		System.out.println("-----------------------------");
	}
	
	
}
