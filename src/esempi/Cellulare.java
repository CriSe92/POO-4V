package esempi;

public class Cellulare {
	private Batteria b;
	private int numSms;
	private int minutiChiamata;
	
	public Cellulare() {
		numSms = 0;
		minutiChiamata = 0;
		b = new Batteria();
	}
	
	public Cellulare(int capacitaBatteria) {
		numSms = 0;
		minutiChiamata = 0;
		b = new Batteria(capacitaBatteria);
	}
	
	public Cellulare(int numSms, int minutiChiamata, int capacitaBatteria, int livBatteria) {
		this.numSms = numSms;
		this.minutiChiamata = minutiChiamata;
		b = new Batteria(capacitaBatteria, livBatteria);
	}
	
	public Cellulare(int numSms, int minutiChiamata, Batteria b) {
		this.numSms = numSms;
		this.minutiChiamata = minutiChiamata;
		b = new Batteria(b);
	}
	
	public boolean sms() {
		if(b.getLivelloCarica()>0) {
			numSms++;
			b.consuma();
			return true;
		}
		return false;
	}
	
	public int chiamata(int durata) {
		
		while(durata>0 && b.getLivelloCarica()>0){
			
			if(durata >=5) {
				durata = durata - 5;
				minutiChiamata = minutiChiamata + 5;
			}else {
				minutiChiamata = minutiChiamata + durata;
				durata = 0;
			}
			b.consuma();
		}
		
		if(durata<=0) {
			return 0;
		}else {
			return durata;
		}
		
	}
	
	public int livCarica() {
		return b.getLivelloCarica();
	}
	
}
