package musica;

public class CD{
    //attributi:
	private String titolo;
	private String autore;
	private int numeroBrani;
	private double durata;
	
	//Costruttori
	
	public CD(String t, String a, int nb, double d){
		titolo = t;
		autore = a;
		numeroBrani = nb;
		durata = d;
	}
	
	public CD(CD c){
	    this.titolo = c.titolo;
	    this.autore = c.autore;
	    this.numeroBrani = c.numeroBrani;
	    this.durata = c.durata;
	}
	
	//Metodi Get
	public String getTitolo(){return titolo;}
    public String getAutore(){return autore;}
    public int getNumBrani(){return numeroBrani;}
    public double getDurata(){return durata;}
    
    public void setTitolo(String t){titolo=t;}
    public void setAutore(String a){autore=a;}
    public void setNumBrani(int nB) {numeroBrani=nB;}
    public void setDurata(double g){durata=g;}
    
    
    public String toString(){
        return "Titolo: "+titolo+"\nAutore: "+autore+"\nNumero di brani: "+numeroBrani+"\nDurata: "+durata;
    }
    
    public int comparaDurata(double d){
        if(durata>d) return 1;
        if(durata<d) return -1;
        return 0;
    }
    
    public boolean equals(CD c){
        return this.titolo == c.titolo && this.autore == c.autore && this.durata == c.durata && this.numeroBrani == c.numeroBrani;
    }
}
