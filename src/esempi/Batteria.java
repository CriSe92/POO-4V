package esempi;

public class Batteria {
	private int capacitaCarica;
	private int livelloCarica;
	
	public Batteria() {
		capacitaCarica = 100;
		livelloCarica = 50;
	}
	
	public Batteria(int cc) {
		capacitaCarica = cc;
		livelloCarica = cc;
	}
	
	public Batteria(int cc, int lv) {
		capacitaCarica = cc;
		livelloCarica = lv;
	}
	
	public Batteria(Batteria b) {
		this.capacitaCarica = b.capacitaCarica;
		this.livelloCarica = b.livelloCarica;
	}
	
	public void consuma() {
		if(livelloCarica>0)
			livelloCarica--;
	}
	
	public void ricarica(int c) {
		livelloCarica = livelloCarica + c;
		if(livelloCarica>capacitaCarica) {
			livelloCarica = capacitaCarica;
		}
	}
	
	public int getLivelloCarica() {
		return livelloCarica;
	}
	
	public int getCapacitaCarica() {
		return capacitaCarica;
	}
	
	public String toString() {
		return "Batteria carica al "+livelloCarica+"%"+"\n"+
				"Capacità massima: "+capacitaCarica;
	}
}
