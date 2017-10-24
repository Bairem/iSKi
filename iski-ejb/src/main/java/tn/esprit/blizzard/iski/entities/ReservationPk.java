package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ReservationPk
 *
 */
@Embeddable

public class ReservationPk implements Serializable {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEquipment;
		result = prime * result + idReservation;
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
		ReservationPk other = (ReservationPk) obj;
		if (idEquipment != other.idEquipment)
			return false;
		if (idReservation != other.idReservation)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	private int idUser;
	private int idEquipment;
	private int idReservation;
	private static final long serialVersionUID = 1L;

	public ReservationPk() {
		super();
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdEquipment() {
		return this.idEquipment;
	}

	public void setIdEquipment(int idEquipment) {
		this.idEquipment = idEquipment;
	}   
	public int getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
   
}
