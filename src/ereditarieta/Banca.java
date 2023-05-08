package ereditarieta;

public class Banca {

	public static void main(String[] args) {
		ContoBancario cb = new ContoBancario("1234",3000);
		ContoConFido cf = new ContoConFido("4567",1000,500);
		
		//classe base <-- classe derivata
		cb = cf;
		
		//Parte la versione di preleva definita in ContoConFido
		cb.preleva(10);
		
		//Errore in fase di compilazione!
		//cb.getFido();
		
		/*Object è l'antenato di tutte le classi Java, quindi ad un
		oggetto di classe Object posso assegnare un oggetto di una classe
		qualunque.
		In questo esempio:
		TIPO STATICO di o --> Object
		TIPO DINAMICO di o --> ContoBancario 
		*/
		Object o = new ContoBancario("1535",1000);
		
		ContoBancario[] array = new ContoBancario[5];
		/*
		* TIPO STATICO array[0] --> ContoBancario
		* TIPO DINAMICO array[0] --> ContoBancario
		*/
		array[0] = new ContoBancario("1253",1520);
		/*
		* TIPO STATICO array[1] --> ContoBancario
		* TIPO DINAMICO array[1] --> ContoConFido
		*/
		array[1] = new ContoConFido("1563",4532,450);
		
		/*classe derivata <--- classe base
		* ERRORE! 
		*/
		//cf = cb;
		
		/*
		* Controllo se cb ha tipo (dinamico) ContoConFido
		*/
		if(cb instanceof ContoConFido){
			/*
			* Se scopro che cb ha tipo (dinamico) ContoConFido
			* posso assegnarlo alla variabile cf (di tipo ContoConFido)
			* facendo un'operazione di Casting, cioè cambiando il punto
			* di vista di cb.
			*/
			cf = (ContoConFido)cb;
		}
	}
}
