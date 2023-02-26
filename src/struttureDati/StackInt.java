package struttureDati;

public class StackInt {
	private int[] mem;
	private int p; //posizione dell'ultimo elemento inserito
	
	public StackInt(int n) {
		mem = new int[n];
		p=-1;
	}
	
	public void push(int x) {
		p++;
		if(p<mem.length)
			mem[p] = x;
	}
	
	public int pop() {
		int x;
		if(p>-1) {
			x = mem[p];
			p--;
		}
		return -1;
	}
	
	public int top() {
		return mem[p];
	}
	
	public int size() {
		return p+1;
	}
	

}
