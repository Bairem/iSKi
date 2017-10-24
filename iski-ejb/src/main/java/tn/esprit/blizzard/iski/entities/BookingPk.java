package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: BookingPk
 *
 */
@Embeddable

public class BookingPk implements Serializable {

	private int idUser;
	private int idEvent;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEvent;
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
		BookingPk other = (BookingPk) obj;
		if (idEvent != other.idEvent)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	private static final long serialVersionUID = 1L;

	public BookingPk() {
		super();
	}

}
