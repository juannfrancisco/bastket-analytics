/**
 * Programa tu futuro - Fundación Emplea
 * Universidad de Chile 
 * Curso de Programación en java
 */
package cl.magnolabs.basket.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Juan Maldonado León
 *
 */
public class ServiceLocator {
	
	private ApplicationContext context;
	private static ServiceLocator _instance = null;
	private static final String NAME_FILE = "configuracion.xml";
	
	private ServiceLocator(){
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public static ServiceLocator getInstance(){
		if( null ==_instance ){
			ServiceLocator locator = new ServiceLocator();
			ApplicationContext context = new ClassPathXmlApplicationContext(NAME_FILE);
			locator.setContext(context);
			_instance = locator;
		}
		return _instance;
	}
	
	/**
	 * 
	 */
	public Object getBean( String name )
	{
		return this.getContext().getBean(name);
	}
	
	
	/**
	 * 
	 */
	public ApplicationContext getContext()
	{
		return context;
	}

	/**
	 * @param context the context to set
	 */
	public void setContext(ApplicationContext context) {
		this.context = context;
	}
}
