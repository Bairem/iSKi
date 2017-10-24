package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ComplaintPk
 *
 */
@Embeddable

public class ComplaintPk implements Serializable {
	private int idComplaint;
	private int idUser;
	private int idReservation;
	private static final long serialVersionUID = 1L;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idComplaint;
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
		ComplaintPk other = (ComplaintPk) obj;
		if (idComplaint != other.idComplaint)
			return false;
		if (idReservation != other.idReservation)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}



	public ComplaintPk() {
		super();
	}   
	public int getIdComplaint() {
		return this.idComplaint;
	}

	public void setIdComplaint(int idComplaint) {
		this.idComplaint = idComplaint;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdReservation() {
		return this.idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}
   
}
