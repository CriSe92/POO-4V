package geomatria;

public class Punto{
   private double x, y;
   
 //costruttore di default
   public Punto(){
      x = 0;
      y = 0;
   }
   
   //costruttore normale
   public Punto( double x, double y ){
      this.x=x; this.y=y;
   }
   
 //costruttore di copia
   public Punto( Punto p ){
      this.x = p.x;
      this.y = p.y;
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
   
   public static void main( String[] args ){
	    Punto p0 = new Punto();
		Punto p1 = new Punto(-3,4);
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