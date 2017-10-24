package tn.esprit.blizzard.iski.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Station
 *
 */
@Entity

public class Station implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStation;
	private String name;
	private String country;
	private String city;
	private String description;
	private String image;
	private int capacity;
	private Piste piste;
	private ArrayList<SkiTrip> skiTrips;

	@OneToMany(mappedBy = "station")
	public List<SkiTrip> getSkiTrips() {
		return skiTrips;
	}

	public void setSkiTrips(ArrayList<SkiTrip> skiTrips) {
		this.skiTrips = skiTrips;
	}

	public Piste getPiste() {
		return piste;
	}

	public void setPiste(Piste piste) {
		this.piste = piste;
	}

	private static final long serialVersionUID = 1L;

	public Station() {
		piste = new Piste();
	}

	public int getIdStation() {
		return this.idStation;
	}

	public void setIdStation(int idStation) {
		this.idStation = idStation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public class Piste implements Serializable {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idPiste;
		private String name;
		private String difficulty;
		private String image;
		private String length;
		private static final long serialVersionUID = 1L;

		public Piste() {
			super();
		}

		public int getIdPiste() {
			return this.idPiste;
		}

		public void setIdPiste(int idPiste) {
			this.idPiste = idPiste;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDifficulty() {
			return this.difficulty;
		}

		public void setDifficulty(String difficulty) {
			this.difficulty = difficulty;
		}

		public String getImage() {
			return this.image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public String getLength() {
			return this.length;
		}

		public void setLength(String length) {
			this.length = length;
		}

	}

}
