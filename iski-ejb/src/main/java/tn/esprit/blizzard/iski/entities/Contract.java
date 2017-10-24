package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Contract
 *
 */
@Entity

public class Contract implements Serializable {

	private ContractPk contractPk;
	private Date startDate;
	private Date endDate;
	private User user;
	private Company company;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser",
	insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "idCompany", referencedColumnName = "idCompany", insertable = false, updatable = false)
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	private static final long serialVersionUID = 1L;

	public Contract() {
		super();
	}

	@EmbeddedId
	public ContractPk getContractPk() {
		return contractPk;
	}

	public void setContractPk(ContractPk contractPk) {
		this.contractPk = contractPk;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
