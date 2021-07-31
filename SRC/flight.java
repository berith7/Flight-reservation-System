package com.company;

public class flight {


    public class Flight {


        private String flightNumber;
        private String airline;
        private int capacity;
        private int bookedSeats;


        public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
            this.flightNumber = flightNumber;
            this.airline = airline;
            this.capacity = capacity;
            this.bookedSeats = bookedSeats;
        }


        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getAirline() {
            return airline;
        }

        public void setAirline(String airline) {
            this.airline = airline;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }

        public int getBookedSeats() {
            return bookedSeats;
        }

        public void setBookedSeats(int bookedSeats) {
            this.bookedSeats = bookedSeats;
        }
        //setters and getters end

        //methods
        public String getFlightDetails(){
            return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
        }

        public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){
            flightNumber = flightDetails[0];
            airline = flightDetails[1];
            this.capacity = capacity;
            this.bookedSeats = bookedSeats;
        }

        boolean checkAvailability(){
            boolean availability = false;
            if(bookedSeats < capacity) {
                availability = true;
            }
            return availability;
        }

        void incrementBookingCounter(){
            ++bookedSeats;
        }
    }
}
