package curso.java.concierto.musicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.java.concierto.anotaciones.Conectar;
import curso.java.concierto.anotaciones.Vigilado;
import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.instrumentos.Tambor;

@Component
public class Solista extends Musico
{

	@Override
	@Vigilado
	@Conectar
	public void tocar() 
	{
		Optional<Instrumento> instrumento=Optional.ofNullable(getInstrumento());
		setInstrumento(instrumento.orElse(new Tambor("pom, pom, pom")));
		
		System.out.println(getInstrumento().sonar());
		
	}
	
	public Solista(Instrumento instrumento) {
		super(instrumento);
	}
	
	@Override
	@Autowired
	@Qualifier("tambor")
	public void setInstrumento(Instrumento instrumento)
	{
		// TODO Auto-generated method stub
		super.setInstrumento(instrumento);
	}
	
	

}
