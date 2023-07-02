package com.example.jpaExample;

import java.util.*;

public class RestaurantResponse {

		private Long id;
		
		private String name;
		private String address;
		private List<SeatDto> seats;


		public RestaurantResponse() {
			super();
		}

		public RestaurantResponse(Long id, String name, String address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;

		}
		public RestaurantResponse(Long id, String name, String address, List<SeatDto> seats) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.seats = seats;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public List<SeatDto> getSeats(){
			return seats;
		}
		
		public void setSeats(List<SeatDto> seats){
			this.seats = seats;
		}

		@Override
		public String toString() {
			return "Restaurant [id=" + id + ", name=" + name + ", address=" + address + "]";
		}
		
}
