package restful_booker_API_POJO_CC;

public class CreateBooking_Pojo {
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private String additionalneeds;	
	private BookingDates_PoJo bookingdates;
	
	public CreateBooking_Pojo()
	  {	  	  }
	
	
  public CreateBooking_Pojo(String firstname ,String lastname ,int totalprice,boolean depositpaid,
		  BookingDates_PoJo bookingdates , String additionalneeds)
  {
	  this.firstname =firstname;
	  this.lastname =lastname;
	  this.totalprice =totalprice;
	  this.depositpaid =depositpaid;
	  this.bookingdates = bookingdates;	
	  this.additionalneeds =additionalneeds;
  }

  public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public int getTotalprice() {
		return totalprice;
	}

	public boolean getDepositpaid() {
		return depositpaid;
	}

	public String getAdditionalneeds() {
		return additionalneeds;
	}

	public BookingDates_PoJo getBookingdates() {
		return bookingdates;
	}

	
}
