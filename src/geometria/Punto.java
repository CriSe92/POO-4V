package geometria;

public class Punto{
   private double x, y;
   private static int puntiCreati = 0;
   
 //costruttore di default
   public Punto(){
      x = 0;
      y = 0;
      puntiCreati++;
   }
   
   //costruttore normale
   public Punto( double x, double y ){
      this.x=x; this.y=y;
      puntiCreati++;
   }
   
 //costruttore di copia
   public Punto( Punto p ){
      this.x = p.x;
      this.y = p.y;
      puntiCreati++;
   }
   
   public double getX(){ return x; }
   
   public double getY(){ return y; }
   
  public void sposta(double px, double py) {
		x = px;
		y = py;
	}
	
	public double distanza(Punto p) {
		return Math.sqrt((this.x - p.x)*(this.x - p.x) + (this.y - p.y)*(this.y - p.y));
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
   public boolean equals( Punto p ){
      return this.x == p.x && this.y == p.y;
   }//equals
   
   public static int getPuntiCreati() {
	   return puntiCreati;
   }
   
   public static void main( String[] args ){
	    System.out.println("Punti Creati = "+Punto.puntiCreati);
	    Punto p0 = new Punto();
	    System.out.println("Punti Creati = "+Punto.puntiCreati);
		Punto p1 = new Punto(-3,4);
	    System.out.println("Punti Creati = "+Punto.puntiCreati);
		/*Se stampo prima di implementare toString() verrà stampato l'indirizzo di memoria del punto*/
		System.out.println(p0);
		System.out.println(p1);//E' uguale a fare System.out.println(p1.toString());
		double dist = p0.distanza(p1);
		System.out.println("La distanza tra "+p0+" e "+p1+" è "+dist);
		/*ATTENZIONE, con questa operazione i p0 e p1 faranno riferimento alla
		 * stessa area di memoria!
		 * Eventuali modifiche su p1 avranno effetto anche su p0 e viceversa!
		 * p0 = p1;
		 * */
		/*Copio p1 in p0, ora se sposto p1 le coordinate di p0 non subiranno modifiche*/
		p0 = new Punto(p1);
		p1.sposta(5, 8);
		System.out.println("p0: "+p0);
		System.out.println("p1: "+p1);
   }
  //main di test
}//Punto