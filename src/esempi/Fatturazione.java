package esempi;

public class Fatturazione {
	
	public static void main(String[] args) {
		Cliente giovanni = new Cliente("Giovanni","12345678910");
		String prodotto1 = "Melanzane";
		double qta_prodotto1 = 3.5;
		
		Fattura f1 = new Fattura(giovanni);
		f1.setDescrizione(prodotto1);
		f1.setQta(qta_prodotto1);
		f1.setPrezzo(2.59);
		f1.setPrezzo(2.39);
		System.out.println(f1);
		giovanni.stampaSituazione();
		f1.emettiFattura();
		giovanni.stampaSituazione();
		giovanni.paga(5);
		giovanni.stampaSituazione();
		
		
		System.out.println("----------------------");
		Fattura f2 = new Fattura(giovanni,"Zucchine",2,1.59);
		System.out.println(f2);
		f2.emettiFattura();
		giovanni.stampaSituazione();
		giovanni.paga(9);
		giovanni.stampaSituazione();
		
		/*
		System.out.println("----------------------");
		Cliente roberta = new Cliente("Roberta","12345678888");
		Fattura f3 = new Fattura(roberta,"Mele",1.5,0.89);
		System.out.println(f3);
		
		System.out.print("Quante fatture hai emesso? ");
		System.out.println(Fattura.getNumeroCorrente()-1);
		*/
	}
}
