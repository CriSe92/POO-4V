package agggregazione;

public class AreaStoccaggio {
	
	private String nome;
	private Container[] container;
	
	public AreaStoccaggio(String nome, int numContainer) {
		this.nome = nome;
		container = new Container[numContainer];
	}
	
	public String getNome() {
		return nome;
	}
	
	private int controllaPosizione(int pos) {
		if(pos<0 || pos>container.length) {
			return -1;
		}
		if(container[pos]!=null) {//posizione occupata
			return -2;
		}
		return pos;
	}
	
	public int inserisciContainer(int pos, Container c) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {//posOK>=0
			container[pos] = c;
			return pos;
		}
		return posOK;
	}
	
	public int operazione(int oggetti, char tipo, int pos) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {//posOK>=0
			if(tipo == 'M') {
				return container[pos].metti(oggetti);
			}else {
				if(tipo == 'T') {
					return container[pos].togli(oggetti);
				}else {
					return -3;
				}
			}
		}
		return posOK;
	}
	
	public int getStatoRimpimento(int pos) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {//posOK>=0
			return container[pos].getStatoRiempimento();
		}
		return posOK;
	}
	
	public int getCapienzaMax(int pos) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {
			container[pos].getCapienzaMax();
		}
		return posOK;
	}
	
	public int getCapienzaArea() {
		return container.length;
	}
	
	public int getNumContainerPresenti() {
		int conta = 0;
		for(int i=0; i<container.length; i++) {
			if(container[i]!=null)
				conta++;
		}
		return conta;
	}
	
	public int rimuoviContainer(int pos) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {
			container[pos] = null;
			return pos;
		}
		return posOK;
	}
	
	public Container getContainer(int pos) {
		int posOK = controllaPosizione(pos);
		if(posOK == pos) {
			return container[pos];
		}
		return null;
	}
	
	public String toString() {
		return "";
	}
	
	public static void main(String[] args) {
		AreaStoccaggio as = new AreaStoccaggio("Area1", 10);
		Container c1 = new Container(5);
		as.inserisciContainer(4, c1);
	}
}
