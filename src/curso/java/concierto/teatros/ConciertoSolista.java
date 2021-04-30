package curso.java.concierto.teatros;

import java.util.Optional;

import javax.sound.midi.Instrument;

import curso.java.concierto.excepciones.InstrumentoRotoException;
import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.instrumentos.Tambor;
import curso.java.concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {
		
		Solista solista= new Solista();
		Tambor tambor= null;
		Optional<Instrumento> instrumentoOptional=Optional.ofNullable(tambor);
		 instrumentoOptional.get().setSonido("pom, pom, pom");
		solista.setInstrumento(tambor);
		try {
			solista.tocar();
		} catch (Exception e) {
			System.out.println("se ha roto el istrumento");
			System.out.println("voy a arreglar el instrumento");
			
		}

	}

}
