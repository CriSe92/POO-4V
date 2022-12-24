package geometria;

import java.util.Scanner;

public class Geometria{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double x,y;
		System.out.println("Inserisci le coordinate di p2:");
		x=sc.nextDouble();
		y=sc.nextDouble();
		/*Creo un punto usando il costruttore di default*/
	    System.out.println("Punti Creati = "+Punto.getPuntiCreati());
		Punto p0=new Punto();
		/*Creo altri due punti usando il costruttore normale*/
	    System.out.println("Punti Creati = "+Punto.getPuntiCreati());
		Punto p1=new Punto(2,5);
	    System.out.println("Punti Creati = "+Punto.getPuntiCreati());
		Punto p2=new Punto(x,y);
		
		double D12=p1.distanza(p2);
		System.out.printf("La distanza tra p1 e p2 e': %1.2f%n",D12);
		p1.sposta(10,20);
		System.out.println(p0);
		
		Triangolo t=new Triangolo(p0,p1,p2);
		System.out.printf("I punti formano un "+t+"\n"+"La sua area e' %1.2f\n",t.area());
		System.out.printf("Il suo perimetro e' %1.2f\n",t.perimetro());
		System.out.print("Num. vertici poligono: ");
		
		/*Punto è un tipo di dato, quindi posso anche creare un array di Punti!!*/
		int n=sc.nextInt();
		Punto[] v=new Punto[n];
		System.out.println("Inserire i vertici: ");
		for(int i=0; i<v.length; i++){
			System.out.println(i+1+")");
			System.out.print("Ascissa: ");
			x=sc.nextInt();
			System.out.print("Ordinata: ");
			y=sc.nextInt();
			v[i]=new Punto(x,y);
		}
	}
}