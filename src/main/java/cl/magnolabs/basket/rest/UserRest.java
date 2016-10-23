/**
 * Copyright (C) 2015-2016  Magno Labs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cl.magnolabs.basket.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.magnolabs.basket.core.administration.User;
import cl.magnolabs.basket.facade.UserFacade;
import cl.magnolabs.basket.services.ServiceLocator;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
@Path( "championships" )
public class UserRest {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<User> listAll(){
		return getFacade().getAll();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public User findById( @PathParam("name") String name ){
		User user = new User(name);
		return getFacade().getById( user);
	}
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public void add(User user){
		getFacade().save(user);
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private UserFacade getFacade(){
		return (UserFacade)ServiceLocator.getInstance().getBean("user-facade");
	}

}
