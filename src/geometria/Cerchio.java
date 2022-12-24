package geometria;


public class Cerchio {
	
	private Punto centro;
	private double raggio;
	
	public Cerchio() {
		centro = new Punto(0,0);
		raggio = 5;
	}
	
	public Cerchio(Punto c, double r) {
		this.centro = new Punto(c);
		this.raggio = r;
	}
	
	public Cerchio(Cerchio c) {
		
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	public double getRaggio() {
		return raggio;
	}
	
	public double perimetro() {
		return 0;
	}
	
	public double area() {
		return 0;
	}

}