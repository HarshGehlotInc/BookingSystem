package com.example.jpaExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired
	private ReservationRepo reservationRepo;
	
	@Autowired
	private SeatRepo seatRepo;
	
	public void reserveSeat(Long seatId){
		Seat seat = seatRepo.findById(seatId).get();
		Reservation reservation = new Reservation();
		reservation.setSeat(seat);
		reservation.setDetails("Details are important");
		seat.setBooked(true);
		seat.setReservation(reservation);
		reservationRepo.save(reservation);
	}
	
	public List<Reservation> getReservation(){
		return reservationRepo.findAll();
	}
}

