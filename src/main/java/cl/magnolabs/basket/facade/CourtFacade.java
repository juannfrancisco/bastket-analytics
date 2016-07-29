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
import java.util.UUID;

import cl.magnolabs.basket.core.Court;
import cl.magnolabs.basket.dao.court.CourtDAO;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class CourtFacade {

	private CourtDAO dao;
	
	/**
	 * @param team
	 */
	public void save( Court court ){
		court.setOid(UUID.randomUUID().toString());
		dao.save(court);
	}
	
	public List<Court> getAll(  ){
		return dao.getAll();
	}
	
	public Court getById( Court court ){
		return dao.getByID(court);
	}
	
	

	/**
	 * @return the dao
	 */
	public CourtDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(CourtDAO dao) {
		this.dao = dao;
	}
		
	
}
