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

import java.util.List;

import cl.magnolabs.basket.core.administration.User;
import cl.magnolabs.basket.dao.administration.UserDAO;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class UserFacade {

	private UserDAO dao;
	
	/**
	 * @param team
	 */
	public void save( User user ){
		dao.save(user);
	}
	
	public List<User> getAll(  ){
		return dao.getAll();
	}
	
	public User getById( User user ){
		return dao.getByID(user);
	}
	
	

	/**
	 * @return the dao
	 */
	public UserDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(UserDAO dao) {
		this.dao = dao;
	}
		
	
}
