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
package cl.magnolabs.basket.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cl.magnolabs.basket.core.Player;
import cl.magnolabs.basket.core.Team;
import cl.magnolabs.basket.dao.team.TeamDAO;
import cl.magnolabs.basket.services.ServiceLocator;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class TeamFacade {

	private TeamDAO dao;
	
	/**
	 * @param team
	 */
	public void save( Team team ){
		team.setOid(UUID.randomUUID().toString());
		team.setPlayers( new ArrayList<Player>() );
		dao.save(team);
	}
	
	public List<Team> getAll(  ){
		return dao.getAll();
	}
	
	public Team getById( Team team ){
		return dao.getByID(team);
	}
	
	/**
	 * 
	 * @param team
	 * @param player
	 */
	public void addPlayer( Team team, Player player ){
		player.setOid(UUID.randomUUID().toString());
		player.setOidCurrentTeam(team.getOid());
		
		PlayerFacade facade = (PlayerFacade)ServiceLocator.getInstance().getBean("player-facade");
		facade.save(player);
		
		team = dao.getByID(team);
		team.getPlayers().add(player);
		dao.save(team);
	}

	/**
	 * @return the dao
	 */
	public TeamDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(TeamDAO dao) {
		this.dao = dao;
	}
		
	
}
