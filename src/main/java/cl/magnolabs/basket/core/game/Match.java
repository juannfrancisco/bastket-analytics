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
package cl.magnolabs.basket.core.game;

import java.util.Date;

import cl.magnolabs.basket.core.Court;
import cl.magnolabs.basket.core.Team;

/**
 * @author Juan Francisco Maldonado León - juan.maldonado.leon@gmail.com
 * Magno Labs - Santiago de Chile
 * Estadisticas de Deportes - Basketball
 */
public class Match {

	private String oid;
	private Date date;
	private Team visitor;
	private Team local;
	
	private int scoreVisitor;
	private int scoreLocal;
	
	private Court court;
	private Referee referee;
	
	private MatchState state;
	
	public Match(){
	}

	public Match(String oid) {
		this.oid = oid;
	}

	/**
	 * @return the oid
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * @param oid the oid to set
	 */
	public void setOid(String oid) {
		this.oid = oid;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the visitor
	 */
	public Team getVisitor() {
		return visitor;
	}

	/**
	 * @param visitor the visitor to set
	 */
	public void setVisitor(Team visitor) {
		this.visitor = visitor;
	}

	/**
	 * @return the local
	 */
	public Team getLocal() {
		return local;
	}

	/**
	 * @param local the local to set
	 */
	public void setLocal(Team local) {
		this.local = local;
	}

	/**
	 * @return the scoreVisitor
	 */
	public int getScoreVisitor() {
		return scoreVisitor;
	}

	/**
	 * @param scoreVisitor the scoreVisitor to set
	 */
	public void setScoreVisitor(int scoreVisitor) {
		this.scoreVisitor = scoreVisitor;
	}

	/**
	 * @return the scoreLocal
	 */
	public int getScoreLocal() {
		return scoreLocal;
	}

	/**
	 * @param scoreLocal the scoreLocal to set
	 */
	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}

	/**
	 * @return the court
	 */
	public Court getCourt() {
		return court;
	}

	/**
	 * @param court the court to set
	 */
	public void setCourt(Court court) {
		this.court = court;
	}

	/**
	 * @return the referee
	 */
	public Referee getReferee() {
		return referee;
	}

	/**
	 * @param referee the referee to set
	 */
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	
	/**
	 * @return the state
	 */
	public MatchState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(MatchState state) {
		this.state = state;
	}

	@Override
	public boolean equals(Object object) {
		if( object instanceof Match )
			return ((Match)object).getOid().equals( this.getOid() );
		return super.equals(object);
	}
	
}
