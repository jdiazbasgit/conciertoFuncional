package curso.java.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Tambor extends Instrumento
{
	public Tambor(String string) {
		super(string);
	}

	public Tambor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Value("pom, pom, pom")
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}

}
