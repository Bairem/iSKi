package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Booking
 *
 */
@Entity

public class Booking implements Serializable {
	@EmbeddedId
	private BookingPk bookingPk;
	private float price;
	@ManyToOne
	private Event event;
	@ManyToOne
	private User user;

	public BookingPk getBookingPk() {
		return bookingPk;
	}

	public void setBookingPk(BookingPk bookingPk) {
		this.bookingPk = bookingPk;
	}



	@ManyToOne
	@JoinColumn(name = "idEvent", referencedColumnName = "idEvent", insertable = false, updatable = false)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;

	public Booking() {
		super();
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
