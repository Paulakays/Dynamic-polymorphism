package package1;

public class HotelBooking extends TravelService{
	private String hotelName;
	private String roomType;
	private int numberOfGuests;
	private boolean includeBreakfast;
	
	
	public HotelBooking(String hotelName, String roomType, int numberOfGuests,boolean includeBreakfast) {
		super("Andrew","andrew01@gmail.com","Nairobi");
		this.hotelName = hotelName;
		this.roomType = roomType;
		this.numberOfGuests = numberOfGuests;
		this.includeBreakfast = includeBreakfast;
	}
	
	public void book() {
		System.out.println("HotelName: " + hotelName + "\nRoom type: " + roomType + "\nInclude breakfast: " + includeBreakfast + "\nNumber of guests: " + numberOfGuests);
	}

}
