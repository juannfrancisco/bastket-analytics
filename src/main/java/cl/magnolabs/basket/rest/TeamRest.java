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

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import cl.magnolabs.basket.core.Player;
import cl.magnolabs.basket.core.Team;
import cl.magnolabs.basket.services.DataSingleton;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
@Path( "teams" )
public class TeamRest {
	
	@GET
	@Produces( MediaType.APPLICATION_JSON )
	public List<Team> listAllTeams(){
		return DataSingleton.getInstance().getTeams();
	}
	
	@GET
	@Path( "/{oid}" )
	@Produces( MediaType.APPLICATION_JSON )
	public Team findById( @PathParam("oid") String oid ){
		Team team = new Team(oid);
		for(Team t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				return t;
		}
		return null;
	}
	
	
	
	@PUT
	@Produces( MediaType.APPLICATION_JSON )
	public void addTeam(Team team){
		team.setOid(UUID.randomUUID().toString());
		team.setPlayers( new ArrayList<Player>() );
		DataSingleton.getInstance().getTeams().add(team);
	}
	
	
	@PUT
	@Path( "/{oid}/players" )
	@Produces( MediaType.APPLICATION_JSON )
	public void addPlayerTeam(@PathParam("oid") String oid, Player player){
		player.setOid(UUID.randomUUID().toString());
		Team team = new Team(oid);
		for(Team t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				t.getPlayers().add(player);
		}
	}
	

}
