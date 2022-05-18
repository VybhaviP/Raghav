package nestedPOJO;

public class Booking_dates {

	String checkin;
	String chectout;
	
	public Booking_dates(String checkin, String chectout) {
		super();
		this.checkin = checkin;
		this.chectout = chectout;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getChectout() {
		return chectout;
	}

	public void setChectout(String chectout) {
		this.chectout = chectout;
	}
	
}
