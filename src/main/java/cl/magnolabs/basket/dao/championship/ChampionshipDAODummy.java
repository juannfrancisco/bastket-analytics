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
package cl.magnolabs.basket.dao.championship;

import java.util.List;

import cl.magnolabs.basket.core.championship.Championship;
import cl.magnolabs.basket.services.DataSingleton;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class ChampionshipDAODummy extends ChampionshipDAO {

	/**
	 * 
	 * @param team
	 */
	public void save( Championship championship ){
		boolean flag = false;
		for(Championship t : DataSingleton.getInstance().getChampionships() ){
			if(t.equals( championship) ){
				t = championship;
				flag = true;
			}
		}
		if( !flag )
			DataSingleton.getInstance().getChampionships().add(championship);
	}
	

	@Override
	public void update(Championship championship) {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Championship> getAll(  ){
		return DataSingleton.getInstance().getChampionships();
	}
	
	/**
	 * 
	 * @param team
	 * @return
	 */
	public Championship getByID( Championship championship ){
		for(Championship t : DataSingleton.getInstance().getChampionships() ){
			if( t.equals( championship ) )
				return t;
		}
		return null;
	}
}
