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
package cl.magnolabs.basket.dao.team;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;

import cl.magnolabs.basket.core.Team;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class TeamDAODB extends TeamDAO {
	
	
	private MongoOperations connection;

	/**
	 * 
	 * @param team
	 */
	public void save( Team team ){
		connection.save(team);
	}
	

	@Override
	public void update(Team team) {
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Team> getAll( ){
		return connection.findAll( Team.class );
	}
	
	/**
	 * 
	 * @param team
	 * @return
	 */
	public Team getByID( Team team ){
		
		team = connection.findById( team.getOid(), Team.class );
		if( null == team )
			throw new RuntimeException("No se ha encontrado el equipo");
		return team;
	}
	
	

	/**
	 * @return the connection
	 */
	public MongoOperations getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(MongoOperations connection) {
		this.connection = connection;
	}
	
	
}
