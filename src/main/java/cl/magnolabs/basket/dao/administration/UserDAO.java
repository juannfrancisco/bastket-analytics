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
package cl.magnolabs.basket.dao.administration;

import java.util.List;

import cl.magnolabs.basket.core.administration.User;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public abstract class UserDAO {
	
	/**
	 * 
	 * @param team
	 */
	public abstract void save( User user );
	
	/**
	 * 
	 * @param team
	 */
	public abstract void update( User user );
	
	/**
	 * 
	 * @return
	 */
	public abstract List<User> getAll();
	
	/**
	 * 
	 * @param team
	 * @return
	 */
	public abstract User getByID( User user );	
	
}
