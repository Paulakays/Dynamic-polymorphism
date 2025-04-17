package package1;

public class TravelAgency {
	public static void main (String[]args) {
		
		TravelService travelService = new TravelService("Andrew","andrew01@gmail.com","Nairobi");
		HotelBooking hotelBooking = new HotelBooking("Sarova Hotel","suite",10,true);
		FlightBooking flightBooking = new FlightBooking("1921RE","Wilson Airport","Economy","AK10916",23);
		
		travelService.book();
		hotelBooking.book();
		flightBooking.book();
	}

}
