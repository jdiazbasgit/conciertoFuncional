package curso.java.concierto.musicos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Set;

import curso.java.concierto.instrumentos.Instrumento;
/**
 * 
 * @author javierdiaz
 *@version 1.0
 *@since 1.8
 */
public abstract class Musico implements MusicoInterface
{

	private Instrumento instrumento;
	
	private Set<Instrumento> instrumentos;
	
	
	
	/**
	 * Constructor de un musicon con instrumento asignado
	 * @param instrumento a asignar
	 */
	public Musico(Instrumento instrumento)
	{
		this.instrumento=instrumento;
	}
	/**
	 * Construye un musico sin instrumento asignado
	 */
	public Musico()
	{
		
	}
	
	/**
	 * hace sonar al instrumento que tiene asociado
	 * @throws Exception 
	 * @throws InstrumentoRotoException 
	 */
	@Override
	public abstract void tocar() throws Exception ;
	
	
	
	
	/**
	 * devuielve el instrumento del musico
	 * @return el isntrumento
	 */
	public Instrumento getInstrumento()
	{
		return instrumento;
	}
	/**
	 * asigna el instrumento al musoico
	 * @param instrumento a asignar
	 */
	public void setInstrumento(Instrumento instrumento)
	{
		
		this.instrumento = instrumento;
	}
	
	public void tomaInstrumento(Instrumento instrumento)
	{
		this.instrumento=instrumento;
	}
	public Set<Instrumento> getInstrumentos()
	{
		return instrumentos;
	}
	public void setInstrumentos(Set<Instrumento> instrumentos)
	{
		this.instrumentos = instrumentos;
	}
	

}
