package package1;

public class FlightBooking extends TravelService{
	private String flightNumber;
	private String departureAirport;
	private String seatClass;
	private String passportNumber;
	private int seatNumber;
	
	public FlightBooking(String flightNumber, String departureAirport, String seatClass, String passportNumber, int seatNumber  ) {
		super("Andrew","andrew01@gmail.com","Nairobi");
		this.departureAirport = departureAirport;
		this.flightNumber = flightNumber;
		this.passportNumber = passportNumber;
		this.seatClass = seatClass;
		this.seatNumber = seatNumber;
	}
	
	@Override
	public void book() {
		System.out.println("Flight departure airport: " + departureAirport + "\nFlight number: " + flightNumber + "\nPassport number: " + passportNumber + "\nSeat class: " + seatClass
				+"\nSeat number: " + seatNumber);
	}
}
