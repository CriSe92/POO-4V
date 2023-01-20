package giochi;

public class Dado {
	static final int MAX = 6, MIN =1;
	int faccia;
	
	public Dado() {
		lancia();
	}
	
	public void lancia() {
		faccia = (int)(Math.random()*MAX+MIN);
	}
	
	public int getFaccia() {
		return faccia;
	}
	
	public String toString(){
		return "Sto vedendo la faccia "+faccia;
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		int[] contatori = new int[6];
		for(int i=0; i<1000; i++) {
			d1.lancia();
			contatori[d1.getFaccia()-1]++;
		}
		for(int i=0; i<contatori.length; i++) {
			
		}
	}
}
