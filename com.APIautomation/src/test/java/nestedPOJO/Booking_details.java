package nestedPOJO;

public class Booking_details {
String firstname;
String lastname;
String totalprice;
Boolean depositepaid;
String additionalneeds;
Booking_dates bookingdates;
	
	

public Booking_details(String firstname, String lastname, String totalprice, Boolean depositepaid, String additionalneeds,
		Booking_dates bookingdates) {
	super();
	this.firstname = firstname;
	this.lastname = lastname;
	this.totalprice = totalprice;
	this.depositepaid = depositepaid;
	this.additionalneeds = additionalneeds;
	this.bookingdates = bookingdates;
}





public String getFirstname() {
	return firstname;
}





public void setFirstname(String firstname) {
	this.firstname = firstname;
}





public String getLastname() {
	return lastname;
}





public void setLastname(String lastname) {
	this.lastname = lastname;
}





public String getTotalprice() {
	return totalprice;
}





public void setTotalprice(String totalprice) {
	this.totalprice = totalprice;
}





public Boolean getDepositepaid() {
	return depositepaid;
}





public void setDepositepaid(Boolean depositepaid) {
	this.depositepaid = depositepaid;
}





public String getAdditionalneeds() {
	return additionalneeds;
}





public void setAdditionalneeds(String additionalneeds) {
	this.additionalneeds = additionalneeds;
}





public Booking_dates getBookingdates() {
	return bookingdates;
}





public void setBookingdates(Booking_dates bookingdates) {
	this.bookingdates = bookingdates;
}





{
	
}
 


}
