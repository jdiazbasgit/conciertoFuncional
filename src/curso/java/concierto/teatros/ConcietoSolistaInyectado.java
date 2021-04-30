package curso.java.concierto.teatros;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import curso.java.concierto.configuracion.Configuracion;
import curso.java.concierto.excepciones.InstrumentoRotoException;
import curso.java.concierto.musicos.MusicoInterface;
import curso.java.concierto.musicos.Solista;

public class ConcietoSolistaInyectado {

	public static void main(String[] args) throws Exception {

		//ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Configuracion.class);
		
		MusicoInterface solista = (MusicoInterface) ctx.getBean("solista");

		
			solista.tocar();
			

	}

}
