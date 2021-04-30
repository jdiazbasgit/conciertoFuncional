package curso.java.concierto.teatros;

import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		Solista solista= new Solista();
	
		Instrumento tambor=new Instrumento();
		tambor.setSonido("pom, pom, pom");
		solista.setInstrumento(tambor);
		try {
			solista.tocar();
		} catch (Exception e) {
			System.out.println("se ha roto el istrumento");
			System.out.println("voy a arreglar el instrumento");
			
		}

	}

}
