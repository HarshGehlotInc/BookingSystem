package com.example.jpaExample;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Restaurant resaurant;
	private Boolean booked;
	private String numberOfSeat;
	private String cost;
	
	@OneToOne(mappedBy = "", cascade = CascadeType.ALL)
	private Reservation reservation;
	
	public Seat() {
		super();
	}

	public Seat(Long id, Restaurant resaurant, Boolean booked, String numberOfSeat, String cost,
			Reservation reservation) {
		super();
		this.id = id;
		this.resaurant = resaurant;
		this.booked = booked;
		this.numberOfSeat = numberOfSeat;
		this.cost = cost;
		this.reservation = reservation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Restaurant getResaurant() {
		return resaurant;
	}

	public void setResaurant(Restaurant resaurant) {
		this.resaurant = resaurant;
	}

	public Boolean getBooked() {
		return booked;
	}

	public void setBooked(Boolean booked) {
		this.booked = booked;
	}

	public String getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(String numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Seat [id=" + id + ", resaurant=" + resaurant + ", booked=" + booked + ", numberOfSeat=" + numberOfSeat + ", cost=" + cost
				+ "]";
	}
	
	
}
