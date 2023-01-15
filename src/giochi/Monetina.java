package giochi;

public class Monetina {
	
	private int faccia;
	
	public Monetina() {
		lancia();
	}
	
	public void lancia() {
		if(Math.random() < 0.5) {
			faccia = 0;
		}else {
			faccia = 1;
		}		
		//faccia = (int)(Math.random()*2);
	}
	
	public int getFaccia() {
		return faccia;
	}
	
	public String toString() {
		if (faccia == 0){
			return "Testa";
		}
		return "Croce";
	}
	
	public static void main(String[] args) {
		Monetina m1 = new Monetina();
		Monetina m2 = new Monetina();
		
		int contaTeste = 0, contaCroci = 0;
		for(int i=0; i<1000; i++) {
			m1.lancia();
			if(m1.getFaccia() == 0) {
				contaTeste++;
			}else {
				contaCroci++;
			}
		}
		System.out.println("Teste: "+contaTeste);
		System.out.println("Croci: "+contaCroci);
		
		/*Ottenere tre teste consecutive*/
		int contaTestem1=0;
		int contaTestem2=0;
		
		while(contaTestem1<3 || contaTestem2<3) {
			m1.lancia();
			m2.lancia();
			if(m1.getFaccia() == 0) {
				contaTestem1++;
			}else {
				contaTestem1=0;
			}
			
			if(m2.getFaccia() == 0) {
				contaTestem2++;
			}else {
				contaTestem2=0;
			}
		}
		
		if(contaTestem1 == contaTestem2) {
			System.out.println("Parità");
		}else {
			if(contaTestem1 == 3) {
				System.out.println("Monetina 1 vince!");
			}else {
				System.out.println("Monetina 2 vince!");
			}
		}
	}

}
