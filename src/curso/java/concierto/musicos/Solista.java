package curso.java.concierto.musicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import curso.java.concierto.instrumentos.Instrumento;

@Component
public class Solista extends Musico
{

	@Override
	public void tocar() throws Exception 
	{
		System.out.println(getInstrumento().sonar());
		
	}
	
	@Override
	
	public void setInstrumento(Instrumento instrumento)
	{
		// TODO Auto-generated method stub
		super.setInstrumento(instrumento);
	}
	
	

}
