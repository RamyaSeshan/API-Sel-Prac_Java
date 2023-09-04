package restful_booker_API_POJO_CC;

public class Booking_ID_POJO {
  // This POJO is for GetBookingID_FromName response deserialization 
	// will work for both int and Interger
	
	private int bookingid;

	public Booking_ID_POJO()
	{ 		}
	
	public Booking_ID_POJO(int bookingid)
	{
		this.bookingid =bookingid;
	}
	
	public int getBookingid()
	{ 
	 return bookingid;
	}
	
}
