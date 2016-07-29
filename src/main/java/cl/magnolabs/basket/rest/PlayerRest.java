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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.magnolabs.basket.core.Player;
import cl.magnolabs.basket.facade.PlayerFacade;
import cl.magnolabs.basket.services.ServiceLocator;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
@Path( "players" )
public class PlayerRest {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Player> listAll(){
		return getFacade().getAll();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Player findById( @PathParam("oid") String oid ){
		Player player = new Player(oid);
		player = getFacade().getById(player);
		return player;
	}
	
	
	
	/**
	 * 
	 * @return
	 */
	private PlayerFacade getFacade(){
		return (PlayerFacade)ServiceLocator.getInstance().getBean("player-facade");
	}

}
