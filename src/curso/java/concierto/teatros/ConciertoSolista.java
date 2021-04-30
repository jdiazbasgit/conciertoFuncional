package curso.java.concierto.teatros;

import java.util.Optional;

import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.instrumentos.Tambor;
import curso.java.concierto.musicos.Musico;
import curso.java.concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		Solista solista = null;

		Optional<Musico> solistaOptional = Optional.ofNullable(solista);
		solista=(Solista) solistaOptional.orElse(new Solista(new Tambor("pom, pom, pom")));
		Instrumento tambor = null;

		Optional<Instrumento> tamborOptional = Optional.ofNullable(tambor);
		tamborOptional.ifPresent((i) -> {

			
			// i.setSonido("pom, pom, pom");

		});

		solista.setInstrumento(tamborOptional.orElse(tambor));
		Optional.ofNullable(solista).ifPresent((s) -> s.tocar());

		// System.out.println("se ha roto el istrumento");
		// System.out.println("voy a arreglar el instrumento");

	}

}
