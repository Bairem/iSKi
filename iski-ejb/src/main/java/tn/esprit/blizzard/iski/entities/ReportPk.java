package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ReportPk
 *
 */
@Embeddable

public class ReportPk implements Serializable {

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTrade;
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
		ReportPk other = (ReportPk) obj;
		
		if (idTrade != other.idTrade)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}

	private int idTrade;
	private int idUser;
	private static final long serialVersionUID = 1L;

	public ReportPk() {
		super();
	}   
	public int getIdTrade() {
		return this.idTrade;
	}

	public void setIdTrade(int idTrade) {
		this.idTrade = idTrade;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	
}
