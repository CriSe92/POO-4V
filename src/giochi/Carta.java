package giochi;

public class Carta {
	
	private int seme;
    private int valore;
    
    public Carta(int s, int v) {
    	this.seme = s;
    	this.valore = v;
    }
    
    private String numToSeme(int numSeme) {
        String seme = null;
    	switch(numSeme){
        case 0:
            seme="spade";//spade
            break;
        case 1:
            seme="bastoni";//bastoni
            break;
        case 2:
            seme="denari";//denari
            break;
        case 3:
            seme="coppe";//coppe
            break;
    }
    	return seme;
   }
   
    public int getValore(){return valore;}
    
    public int getSeme(){return seme;}
    
    public String toString() {
    	return valore+""+numToSeme(seme);
    }
}
