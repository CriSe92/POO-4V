package esempi;

import java.util.Scanner;

public class UsaIlCellulare {
	public static void main(String[] args) {
		/*"Compro un cellulare nuovo con una capacità di carica di 50 unità*/
		Cellulare c = new Cellulare(50);
		//Mando 10 sms
		boolean okSms;
		for(int i = 0; i<10; i++) {
			okSms = c.sms();
			if(okSms) {
				System.out.println("SMS inviato");
			}else {
				System.out.println("La batteria si è scaricata, non posso mandare più sms. Ricaricami!");	
			}
		}
		
		System.out.println("Qual è il livello di carica del cellualare?");
		//ATTENZIONE: il main non conosce la batteria, quindi devo per forza chiedere al cellulare il suo livello di carica
		System.out.println(c.livCarica());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto dura la chiamata?");
		int durata = sc.nextInt();
		int durataRestante = c.chiamata(durata);
		
		if(durataRestante == 0) {
			System.out.println("Chiamata effettuata con successo");
		}else {
			System.out.println("La chiamata è terminata perché si è scaricata la batteria");
			System.out.println("Durata reale: "+(durata - durataRestante));
		}
	}
}
