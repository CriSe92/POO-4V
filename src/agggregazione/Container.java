package agggregazione;

public class Container {
	
	private int idContainer;
	private int capienzaMax;
	private int riempimento;
	
	private static int prossimoContainer = 1;
	
	public Container() {
		idContainer = prossimoContainer;
		capienzaMax = 100;
		riempimento = 0;
		prossimoContainer++;
	}
	
	public Container(int campienzaMax) {
		idContainer = prossimoContainer;
		this.capienzaMax = campienzaMax;
		riempimento = 0;
		prossimoContainer++;
	}
	
	public int metti(int oggetti) {
		riempimento = riempimento + oggetti; 
		if(riempimento > capienzaMax) {
			//oggetti non messi
			int residuo = riempimento - capienzaMax;
			riempimento = capienzaMax;
			return residuo;
		}
		return 0;
	}
	
	public int togli(int oggetti) {
		riempimento = riempimento - oggetti;
		if(riempimento < 0) {
			//oggetti non tolti
			int residuo = -riempimento;
			riempimento = 0;
			return residuo;
		}
		return 0;
	}
	
	public int getCapienzaMax() {
		return capienzaMax;
	}
	
	public int getStatoRiempimento() {
		return riempimento;
	}
	
	public String toString() {
		return "Container n. "+idContainer+"\n"+
				"Capienza max: "+capienzaMax+"\n"+
				"Riempimenti: "+riempimento;
	}
	
	public static int containerCreati() {
		return prossimoContainer-1;
	}
	
	public static void main(String[] args) {
		Container c = new Container(10);
		int m, t;
		m = c.metti(11);
		System.out.println("Oggetti non messi "+m);
		t = c.togli(3);
		System.out.println("Oggetti non tolti "+t);
		m = c.metti(5);
		System.out.println("Oggetti non messi "+m);
		t = c.togli(13);
		System.out.println("Oggetti non tolti "+t);
	}

}
