package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: SkiTripPk
 *
 */
@Embeddable

public class SkiTripPk implements Serializable {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAccomodation;
		result = prime * result + idStation;
		result = prime * result + idTransport;
		result = prime * result + idUser;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SkiTripPk other = (SkiTripPk) obj;
		if (idAccomodation != other.idAccomodation)
			return false;
		
		if (idStation != other.idStation)
			return false;
		if (idTransport != other.idTransport)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	private int idUser;
	private int idStation;
	private int idAccomodation;
	private int idTransport;
	private static final long serialVersionUID = 1L;

	public SkiTripPk() {
		super();
	}

	

	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdStation() {
		return this.idStation;
	}

	public void setIdStation(int idStation) {
		this.idStation = idStation;
	}

	public int getIdAccomodation() {
		return this.idAccomodation;
	}

	public void setIdAccomodation(int idAccomodation) {
		this.idAccomodation = idAccomodation;
	}

	public int getIdTransport() {
		return this.idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

}
