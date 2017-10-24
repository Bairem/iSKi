package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Trade
 *
 */
@Entity

public class Trade implements Serializable {

	private User user;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private Equipment equipments;

	@ManyToOne
	@JoinColumn(name = "idEquipment", referencedColumnName = "idEquipment", insertable = false, updatable = false)

	public Equipment getEquipments() {
		return equipments;
	}

	public void setEquipments(Equipment equipments) {
		this.equipments = equipments;
	}

	@EmbeddedId
	public TradePk getTradePk() {
		return tradePk;
	}

	public void setTradePk(TradePk tradePk) {
		this.tradePk = tradePk;
	}

	private static final long serialVersionUID = 1L;

	public Trade() {
		super();
	}

	private TradePk tradePk;

}
