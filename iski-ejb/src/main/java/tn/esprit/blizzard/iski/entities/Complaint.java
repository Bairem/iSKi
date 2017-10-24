package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {

	private ComplaintPk complaintPk;

	@EmbeddedId

	public ComplaintPk getComplaintPk() {
		return complaintPk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setComplaintPk(ComplaintPk complaintPk) {
		this.complaintPk = complaintPk;
	}

	private static final long serialVersionUID = 1L;
	private String description;

	public Complaint() {
		super();
	}

}
