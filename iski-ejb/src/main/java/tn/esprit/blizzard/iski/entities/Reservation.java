package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Reservation
 *
 */
@Entity

public class Reservation implements Serializable {

	private ReservationPk reservationPk;

	@EmbeddedId
	public ReservationPk getReservationPk() {
		return reservationPk;
	}

	public void setReservationPk(ReservationPk reservationPk) {
		this.reservationPk = reservationPk;
	}

	private Equipment equipment;

	@ManyToOne
	@JoinColumn(name = "idEquipment", referencedColumnName = "idEquipment", insertable = false, updatable = false)

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	private User user;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private Date startDate;
	private Date endDate;
	private float price;
	private static final long serialVersionUID = 1L;

	public Reservation() {
		super();
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
