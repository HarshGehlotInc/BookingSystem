package com.example.jpaExample;

import java.util.Set;

public class RestaurantAndSeat {

	private Restaurant restaurant;
	private Set<Seat> seats;
	public RestaurantAndSeat(Restaurant restaurant, Set<Seat> seats) {
		super();
		this.restaurant = restaurant;
		this.seats = seats;
	}
	public RestaurantAndSeat() {
		super();
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Set<Seat> getSeats() {
		return seats;
	}
	public void setSeats(Set<Seat> seats) {
		this.seats = seats;
	}
	
	
	
}
