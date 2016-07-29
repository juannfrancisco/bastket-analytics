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
package cl.magnolabs.basket.dao.match;

import java.util.List;

import cl.magnolabs.basket.core.game.Match;
import cl.magnolabs.basket.services.DataSingleton;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class MatchDAODummy extends MatchDAO {
	
	public void save( Match match ){
		DataSingleton.getInstance().getMatches().add(match);
	}
	
	public List<Match> getAll(  ){
		return DataSingleton.getInstance().getMatches();
	}

	@Override
	public Match findById(Match match) {
		for(Match t : DataSingleton.getInstance().getMatches() ){
			if(t.equals( match) )
				return t;
		}
		return null;
	}

}
