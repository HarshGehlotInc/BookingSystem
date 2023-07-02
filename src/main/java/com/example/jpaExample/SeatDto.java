package com.example.jpaExample;

public class SeatDto {
	
		private Long id;	
		private String numberOfSeat;
		private String cost;
		private Boolean booked; 
		
		public SeatDto() {
			super();
		}

		public SeatDto(Long id, Boolean booked, String numberOfSeat, String cost) {
			super();
			this.id = id;
			this.booked = booked;
			this.numberOfSeat = numberOfSeat;
			this.cost = cost;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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
			return "Seat [id=" + id + ", booked=" + booked +", numberOfSeat=" + numberOfSeat + ", cost=" + cost
					+ "]";
		}
		
}
