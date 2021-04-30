package curso.java.concierto.musicos;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.java.concierto.instrumentos.Instrumento;
import curso.java.concierto.instrumentos.Tambor;

@Component
public class Solista extends Musico
{

	@Override
	
	public void tocar() throws Exception 
	{
		Optional<Instrumento> instrumento=Optional.ofNullable(getInstrumento());
		setInstrumento(instrumento.orElse(new Tambor("pom, pom, pom")));
		
		Optional<String> sonidoOptional=Optional.ofNullable(getInstrumento().getSonido());
		sonidoOptional.orElseThrow(()->new Exception());
		
		System.out.println(getInstrumento().sonar());
		
	}
	
	public Solista(Instrumento instrumento) {
		super(instrumento);
	}
	
	public Solista() {
		// TODO Auto-generated constructor stub
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
