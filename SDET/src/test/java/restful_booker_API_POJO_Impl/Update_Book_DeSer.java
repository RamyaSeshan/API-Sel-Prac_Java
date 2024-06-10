package restful_booker_API_POJO_Impl;

public class Update_Book_DeSer {
	
	private String firstname;
	private String lastname;
	private int totalprice;
	private boolean depositpaid;
	private String additionalneeds;	
	private BookingDates_PoJo bookingdates;
	
	public Update_Book_DeSer() //
	  {	  	  }
	
	
  public Update_Book_DeSer(String firstname ,String lastname ,int totalprice,boolean depositpaid,
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
