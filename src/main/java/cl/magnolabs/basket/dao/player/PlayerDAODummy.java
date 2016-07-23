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
package cl.magnolabs.basket.dao.player;

import java.util.List;

import cl.magnolabs.basket.core.Player;
import cl.magnolabs.basket.core.Team;
import cl.magnolabs.basket.services.DataSingleton;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class PlayerDAODummy extends PlayerDAO {

	/**
	 * 
	 * @param team
	 */
	public void save( Player player ){
		DataSingleton.getInstance().getPlayers().add(player);
	}
	

	@Override
	public void update(Player player) {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Player> getAll(  ){
		return DataSingleton.getInstance().getPlayers();
	}
	
	/**
	 * 
	 * @param team
	 * @return
	 */
	public Player getByID( Player player ){
		for(Player p : DataSingleton.getInstance().getPlayers() ){
			if(p.equals( player ) )
				player = p;
		}
		Team team = new Team( player.getOidCurrentTeam() );
		for(Team t : DataSingleton.getInstance().getTeams() ){
			if(t.equals( team) )
				player.setCurrentTeam(team);
		}
		return null;
	}
}
