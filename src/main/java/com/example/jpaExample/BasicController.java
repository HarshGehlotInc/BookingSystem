package com.example.jpaExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class BasicController {
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private ReservationService reservationService;
	
	@GetMapping("/res")
	public List<?> getRestaurant(){
		return restaurantService.getAllRestaurant();
//				RestaurantResponse res = restaurantService.getAllRestaurant().get(0);
//				System.out.println(res.getSeats());
//				return res.getSeats();
	}
	
	@PostMapping("/res")
	public void createRestaurant(@RequestBody RestaurantAndSeat resAndSeat) {
		
		restaurantService.createRestaurant(resAndSeat.getRestaurant(), resAndSeat.getSeats());
	}
	
	@GetMapping("/reservation")
	public List<Reservation> getReservation(){
		return reservationService.getReservation();
	}
	
	@PostMapping("/reservation/{seatId}")
	public void reserveTable(@PathVariable long seatId){
		System.out.println(seatId);
		reservationService.reserveSeat(seatId);
	}
	
	
}
