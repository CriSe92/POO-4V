package util;

public class Mat {
	
	private Mat() {}
	
	public static int MCD(int a, int b) {
		int resto;
		do {
			resto = a % b;
			a = b;
			b = resto;
		} while (resto != 0);
		return a;
	}

	public static int mcm(int a, int b) {
		return (a * b) / MCD(a, b);
	}

}
