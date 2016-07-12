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
	
	/**
	 * 
	 */
	public static ApplicationContext getContext()
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("configuracion.xml");
		return context;
	}
}
