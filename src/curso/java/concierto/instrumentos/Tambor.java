package curso.java.concierto.instrumentos;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Tambor extends Instrumento
{
	@Override
	
	public void setSonido(String sonido)
	{
		super.setSonido(sonido);
	}

}
