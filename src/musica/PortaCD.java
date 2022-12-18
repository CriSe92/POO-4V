package musica;

public class PortaCD {

	private CD[] scaffale;
	private int quantiCD = 0;
	private int nCD;

	public PortaCD() {
		nCD = 10;
		scaffale = new CD[nCD];
	}

	public PortaCD(int n) {
		this.nCD = n;
		scaffale = new CD[nCD];
	}

	public PortaCD(PortaCD pCD) {
		this.nCD = pCD.nCD;
		this.quantiCD = pCD.quantiCD;
		this.scaffale = new CD[nCD];
		for (int i = 0; i < nCD; i++) {
			if(pCD.scaffale[i] != null)
			    this.scaffale[i] = new CD(pCD.scaffale[i]);
		}
	}
	
	public int setCD(CD cd, int posizione) {
		//posizione non valida
		if(posizione < 0 || posizione > nCD) {
			return -1;
		}
		//posizione occupata
		if(scaffale[posizione] != null) {
			return -2;
		}
		scaffale[posizione] = new CD(cd);
		quantiCD++;
		return posizione;
	}
	
	public CD getCD(int posizione){
		//posizione non valida
		if(posizione < 0 || posizione > nCD) {
			return null;
		}
		return scaffale[posizione];
		//return new CD(scaffale[posizione]);
	}
	
	public int rimuoviCD(int posizione) {
		//posizione non valida
		if(posizione < 0 || posizione > nCD) {
			return -1;
		}
		//posizione vuota
		if(scaffale[posizione] == null) {
			return -2;
		}
		scaffale[posizione] = null;
		quantiCD--;
		return posizione;
	}
	
	public int getQuantiCD() {
		return quantiCD;
	}
	
	public int getDimensioneMassima() {
		return nCD;
	}
	
	public int spazioResiduo() {
		return nCD - quantiCD;
	}
	
	/*Dato il titolo di un CD, verifica se è presente, lo restituisce*/
	public int cercaCDPerTitolo(String Titolo) {
		for (int i = 0; i < nCD; i++)
			if (scaffale[i].getTitolo().equals(Titolo))
				return i;
		return -1;
	}
	
	
	public String toString() {
		String elenco = "";
		for (int i = 0; i < nCD; i++)
			if (scaffale[i] != null)
				elenco = elenco + scaffale[i].toString() + "\n\n";
		return elenco;
	}
	
	public boolean equals(PortaCD pCD) {
		if(quantiCD != pCD.getQuantiCD()) return false;
		for(int i=0; i<nCD; i++) {
			if(scaffale[i]!=null && pCD.scaffale[i]!=null
			    && !scaffale[i].equals(pCD.scaffale[i]))
		       return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		PortaCD c = new PortaCD(10);
		CD cd1 = new CD("Titolo1", "Autore1", 8, 40);
		CD cd2 = new CD("Titolo2", "Autore2", 10, 45);
		c.setCD(cd1, 0);
		c.setCD(cd2, 0);
	}
}