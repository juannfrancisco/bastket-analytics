package cl.magnolabs.basket.test;

import java.util.Date;

import cl.magnolabs.basket.core.Person;
import cl.magnolabs.basket.services.ServiceLocator;

public class TestPersona {

	public static void main(String[] args) {
		
		Person pesona1 = new Person( "juan", "maldonado", new Date(), 0, 0 );
		System.out.println( pesona1.getName() );
		
		Person pesona2 = (Person)ServiceLocator.getContext().getBean("persona1");
		System.out.println( pesona2.getName() );
	}
	
}
