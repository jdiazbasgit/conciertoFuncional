package curso.java.concierto.teatros;

import java.util.Optional;

import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.instrumentos.Tambor;
import curso.java.concierto.musicos.Musico;
import curso.java.concierto.musicos.Solista;

public class ConciertoSolista {

	public static void main(String[] args) {

		Solista solista = new Solista(new Tambor("cghfgshfgdhdgfhsdfg"));

		Optional<Musico> solistaOptional = Optional.ofNullable(solista);
		solista=(Solista) solistaOptional.orElse(new Solista(new Tambor("pom, pom, pom en orElse")));
		Instrumento tambor = solista.getInstrumento();
		
		solista.setInstrumento(tambor);
		
		

		Optional<Instrumento> tamborOptional = Optional.ofNullable(tambor);
		Tambor t=(Tambor) tamborOptional.orElseGet(() -> {
			// arreglo el tambor y se lo doy
			return new Tambor("pom, pom, pom en orElsegGet");
		});

		solista.setInstrumento(t);
		try {
			solista.tocar();
		} catch (Exception e) {
			System.out.println("El instrumento se ha roto, el concierto ha terminado");
		}


	}

}
