package package1;

public class TravelService {
	private String customerName;
	private String customerEmail;
	private String destination;
	
	public TravelService(String customerName, String customerEmail,String destination){
		this.customerEmail = customerEmail;
		this.customerName = customerName;
		this.destination = destination;
	}
	
	public void book() {
		System.out.println("These are the customer details:");
		System.out.println("Customer name: " + customerName + "\nCustomer email: " + customerEmail +"\nDestination: " + destination);	
	}
}
