import java.sql.Date;
import java.text.SimpleDateFormat;

public class DailyData {
	

	int trackingNumber;         // unique number to identify the person
	double weight;              // their weight
	double steps;				// number of steps for that day
	String today; 				// mm/dd/yy

	

	/**
	 * Default constructor using fields
	 * @param iSteps 
	 * @param iWeight 
	 * @param iTrackingNum 
	 */
	public DailyData(int iTrackingNum, int iWeight, int iSteps) {
		super();
		this.trackingNumber = 2;
		this.weight = 150;
		this.steps = 1000;
	}
	public int getTrackingNumber() {
		return trackingNumber;
	}
	public void setTrackingNumber(int trackingNumber) {
		this.trackingNumber = trackingNumber;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getSteps() {
		return steps;
	}
	public void setSteps(double steps) {
		this.steps = steps;
	}
	
	public String getToday() {
		return today;
	}
	public void setToday(String today) {
		this.today = today;
	}
	
	
	
	

	@Override
	public String toString() {
		return "trackingNumber is " + trackingNumber + ", weight is " + weight + ", steps are " + steps + "";
	}


}
