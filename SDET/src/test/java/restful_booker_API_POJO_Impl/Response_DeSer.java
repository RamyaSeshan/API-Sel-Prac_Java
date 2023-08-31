package restful_booker_API_POJO_Impl;//

public class Response_DeSer {
	private int bookingid;
	private CreateBooking_Pojo booking;
	
	public Response_DeSer( )
	{			
	}
	
	public Response_DeSer( int bookingid ,CreateBooking_Pojo booking)
	{
		this.bookingid =bookingid;
		this.booking =booking;	
	}

	public int getBookingid() {
		return bookingid;
	}

	public CreateBooking_Pojo getBooking() {
		return booking;
	}

	
}


