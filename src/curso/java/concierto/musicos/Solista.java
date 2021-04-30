package curso.java.concierto.musicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.java.concierto.anotaciones.Vigilado;
import curso.java.concierto.instrumentos.Instrumento;

@Component
public class Solista extends Musico
{

	@Override
	@Vigilado
	public void tocar() throws Exception 
	{
		//Optional<Instrumento> instrumento=Optional.ofNullable(getInstrumento());
		//setInstrumento(instrumento.orElseThrow(()->new Exception()));
		System.out.println(getInstrumento().sonar());
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
