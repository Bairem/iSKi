package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: SkiTrip
 *
 */
@Entity

public class SkiTrip implements Serializable {

	private SkiTripPk skiTripPk;
	private Date startDate;
	private Date endDate;
	private Station station;
	private Accomodation accomodation;
	private Transport transport;

	@ManyToOne
	@JoinColumn(name = "idStation", referencedColumnName = "idStation", insertable = false, updatable = false)
	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	@ManyToOne
	@JoinColumn(name = "idAccomodation", referencedColumnName = "idAccomodation", insertable = false, updatable = false)
	public Accomodation getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(Accomodation accomodation) {
		this.accomodation = accomodation;
	}

	@ManyToOne
	@JoinColumn(name = "idTransport", referencedColumnName = "idTransport", insertable = false, updatable = false)
	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	@EmbeddedId
	public SkiTripPk getSkiTripPk() {
		return skiTripPk;
	}

	public void setSkiTripPk(SkiTripPk skiTripPk) {
		this.skiTripPk = skiTripPk;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	private String location;
	private User user;

	@ManyToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private static final long serialVersionUID = 1L;

	public SkiTrip() {
		super();
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
