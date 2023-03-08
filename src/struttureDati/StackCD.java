package struttureDati;

import musica.CD;

public class StackCD {
	private CD[] scaffale;
	private int p=-1;
	
	public StackCD(int n) {
		scaffale = new CD[n];
	}
	
	public void push(CD x) {
		p++;
		if(p>=scaffale.length){
			//non posso fare l'inserimento
			p--;
			throw new RuntimeException("Stack Pieno!");
		}
		scaffale[p] = x;
	}
	
	public CD pop() {
		CD x;
		if(p>-1) {
			x = scaffale[p];
			p--;
			return x;
		}
		return null;
	}
	
	public CD top() {
		return scaffale[p];
	}
	
	public int size() {
		return p+1;
	}
	
	public int length() {
		return scaffale.length;
	}
	
	public void mostraStackCD() {
		for(int i=0; i<p; i++) {
			System.out.println(scaffale[i]);
		}
	}
	
	public static void main(String[] args) {
		StackCD s = new StackCD(3);
		try{
		  s.push(new CD("Titolo1","Autore1",10,120));
		  System.out.println("----"+s.size()+"----");
		  s.push(new CD("Titolo2","Autore2",10,120));
		  System.out.println("----"+s.size()+"----");
		  s.push(new CD("Titolo3","Autore3",10,120));
		  System.out.println("----"+s.size()+"----");
		  //s.push(new CD("Titolo4","Autore4",10,120));
		  //System.out.println("----"+s.size()+"----");
		}catch(RuntimeException e){
		  System.out.println("Qualcosa è andato storto! "+e.getMessage());
		}finally{
		  System.out.println("Sono dentro finally!");
		}
		s.mostraStackCD();
		s.pop();
		//s.mostraStackCD();
	}
	
}
