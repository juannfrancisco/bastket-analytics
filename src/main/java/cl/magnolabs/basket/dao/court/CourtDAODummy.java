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
package cl.magnolabs.basket.dao.court;

import java.util.List;

import cl.magnolabs.basket.core.Court;
import cl.magnolabs.basket.services.DataSingleton;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class CourtDAODummy extends CourtDAO {

	/**
	 * 
	 * @param team
	 */
	public void save( Court court ){
		boolean flag = false;
		for(Court t : DataSingleton.getInstance().getCourts() ){
			if(t.equals( court) ){
				t = court;
				flag = true;
			}
		}
		if( !flag )
			DataSingleton.getInstance().getCourts().add(court);
	}
	

	@Override
	public void update(Court court) {
		
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Court> getAll(  ){
		return DataSingleton.getInstance().getCourts();
	}
	
	/**
	 * 
	 * @param team
	 * @return
	 */
	public Court getByID( Court court ){
		for(Court t : DataSingleton.getInstance().getCourts() ){
			if( t.equals( court ) )
				return t;
		}
		return null;
	}
}
