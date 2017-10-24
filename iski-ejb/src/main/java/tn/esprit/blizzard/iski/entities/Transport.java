package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Transport
 *
 */
@Entity

public class Transport implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTransport;
	private String type;
	private int capacity;
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "transport")
	private List<SkiTrip> skiTrips;

	public List<SkiTrip> getSkiTrips() {
		return skiTrips;
	}

	public void setSkiTrips(List<SkiTrip> skiTrips) {
		this.skiTrips = skiTrips;
	}

	public Transport() {
		super();
	}

	public int getIdTransport() {
		return this.idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
