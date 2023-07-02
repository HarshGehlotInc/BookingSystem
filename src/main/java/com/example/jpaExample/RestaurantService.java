package com.example.jpaExample;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantRepo;
	
	@Autowired
	private SeatRepo seatRepo;
	
	public void createRestaurant(Restaurant restaurant, Set<Seat> seats){
		
		for(Seat seat: seats) {
			seat.setResaurant(restaurant);
		}
		restaurant.setSeats(seats);
		restaurantRepo.save(restaurant);
	}
	
	public List<RestaurantResponse> getAllRestaurant(){
		List<RestaurantResponse> response = new ArrayList<>();
		for(Restaurant res : restaurantRepo.findAll()) {
			System.out.println("seats --------- " + res.getSeats());
			System.out.println(" restaurant ----------" + res);
			List<SeatDto> seats = new ArrayList<>();
			for(Seat seat: res.getSeats()) {
				seats.add(new SeatDto(seat.getId(), false, seat.getNumberOfSeat(), seat.getCost()));
			}
			response.add(new RestaurantResponse(res.getId(), res.getName(), res.getAddress(), seats));
		}
		System.out.println(restaurantRepo.findAll());

		return response;
	}
	
	public Restaurant getRestaurantById(Long id){
		return restaurantRepo.findById(id).get();
	}
	
	public void addSeatToRestaurant(Long id, Seat seat){
		Restaurant restaurant = restaurantRepo.findById(id).get();
		seat.setResaurant(restaurant);
		Set<Seat> seats = restaurant.getSeats();
		seats.add(seat);
		restaurant.setSeats(seats);
		
		restaurantRepo.save(restaurant);
	}

}
