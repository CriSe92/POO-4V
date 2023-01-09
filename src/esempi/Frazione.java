package esempi;

public class Frazione {
	private int num, den;
	public static int contatore = 0;

	public Frazione() {
		this.num = 0;
		this.den = 1;
		contatore++;
	} // costruttore di default

	public Frazione(int num, int den) {
		this.num = num;
		this.den = den;
		if (den == 0) {
			System.err.println("Impossibile dividere per 0");
			System.exit(-1);
		}
		contatore++;
	} // costruttore normale

	public Frazione(Frazione j) {
		this.num = j.num;
		this.den = j.den;
		contatore++;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}

	private int MCD(int a, int b) {
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}

	private int mcm(int a, int b) {
		return (a * b) / MCD(a, b);
	}

	public Frazione semplifica() {
		return new Frazione(num / MCD(num, den), den / MCD(num, den));
	}

	public Frazione reciproca() {
		return new Frazione(den, num);
	}

	public Frazione opposta() {
		return new Frazione(-num, den);
	}

	public Frazione somma(Frazione g) {
		int den = mcm(this.den, g.getDen());
		int num1 = num * (den / this.den);
		int num2 = g.getNum() * (den / g.getDen());
		return new Frazione(num1 + num2, den);
//si puÃ² fare con un solo calcolo ma cosÃ¬ risulta maggiormente leggibile
	}

	public Frazione sottrai(Frazione g) {
		int den = mcm(this.den, g.getDen());
		int num1 = num * (den / this.den);
		int num2 = g.getNum() * (den / g.getDen());
		return new Frazione(num1 - num2, den);
	}

	public Frazione moltiplica(Frazione g) {
		return new Frazione(getNum() * g.getNum(), getDen() * g.getDen());
	}

	public Frazione dividi(Frazione g) {
		return new Frazione(getNum() * g.getDen(), getDen() * g.getNum());
	}

	public String toString() {
		return getNum() + "/" + getDen();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + den;
		result = prime * result + num;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frazione other = (Frazione) obj;
		if (den != other.den)
			return false;
		if (num != other.num)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Frazione f = new Frazione();
		System.out.println(f.toString());
		Frazione g = new Frazione();
		System.out.println(g.toString());
		g = f.somma(g);
		System.out.print(g.toString());
		g = g.semplifica();
		System.out.print("\t" + g.toString());
	}
}
