package geomatria;

public class Triangolo {
	// variabili di istanza
	private Punto p0, p1, p2;
	private double l0, l1, l2;
	
	//Costruttore normale
	public Triangolo(Punto p0, Punto p1, Punto p2) {
		l0 = p0.distanza(p1);
		l1 = p1.distanza(p2);
		l2 = p2.distanza(p0);
		if (l0 >= l1 + l2 || l1 >= l0 + l2 || l2 >= l0 + l1) {
			System.err.println("Triangolo non valido");
			System.exit(-1);
		}
		this.p0 = new Punto(p0);
		this.p1 = new Punto(p1);
		this.p2 = new Punto(p2);
	}

	// metodi
	public double getLato0() {
		return l0;
	}

	public double getLato1() {
		return l1;
	}

	public double getLato2() {
		return l2;
	}

	public double perimetro() {
		return l0 + l1 + l2;
	}

	/*Uso la formula di Erone per implementare il calcolo dell'area*/
	public double area() {
		double s = perimetro() / 2;
		return Math.sqrt(s * (s - l0) * (s - l1) * (s - l2));
	}

	public String toString() {
		return "triangolo con vertici " + p0 + " " + p1 + " " + p2;
	}

	public static void main(String[] args) {
		
		/*Definisco tre punti che saranno i vertici del triangolo*/
		Punto vertice0 = new Punto(0, 1);
		Punto vertice1 = new Punto(3, 2);
		Punto vertice2 = new Punto(4, 7);
		
		/*Uso il costruttore normale del trinagolo per creare un triangolo*/
		Triangolo t = new Triangolo(vertice0,vertice1,vertice2);
		System.out.println(t);
		/*Calcolo e stampo perimetro e area*/
		System.out.printf("perimetro=%1.2f area=%1.2f\n", t.perimetro(), t.area());
		
		/*Modifico uno dei punti usati come vertici del trinagolo*/
		vertice0.sposta(5, -8);
		/*Cosa ti aspetti che sia successo al Triangolo? Prova...*/
		System.out.println(t);
		
	}// main
}// fine classe Triangolo