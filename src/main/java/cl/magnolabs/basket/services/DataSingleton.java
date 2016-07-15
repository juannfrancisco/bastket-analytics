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
package cl.magnolabs.basket.services;

import java.util.ArrayList;
import java.util.List;

import cl.magnolabs.basket.core.Player;
import cl.magnolabs.basket.core.Team;


/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class DataSingleton {
	
	private List<Team> teams;
	private List<Player> players;
	private static DataSingleton _instance;
	
	/**
	 * 
	 */
	private DataSingleton(){
		teams = new ArrayList<Team>();
		players = new ArrayList<Player>();
	}
	
	/**
	 * 
	 * @return
	 */
	public static DataSingleton getInstance(){
		if(null == _instance){
			_instance = new DataSingleton();
		}
		return _instance;
	}



	/**
	 * @return the teams
	 */
	public List<Team> getTeams() {
		return teams;
	}



	/**
	 * @param teams the teams to set
	 */
	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	/**
	 * @return the players
	 */
	public List<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

}
