package restful_booker_APIAuto;

public class BookingDates_PoJo {
	
	private String checkin	;
	private String  checkout;
	
	
	public BookingDates_PoJo()
	{  	}

	
	public BookingDates_PoJo(String checkin ,String  checkout )
	{
		this.checkin= checkin;
		this.checkout = checkout;
	}

	public String getCheckin()
	{
		return checkin;
	}
	
	public String getCheckout()
	{
		return checkout;
	}

}
