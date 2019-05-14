
public class FitPerson extends Person {
	
			int trackingNumber;         // unique number to identify the person
			double height;              // their height in inches
			String iName;               //person's name
			int iAge;                   //person's age
			
			
			/**
			 * Default constructor
			 */
			public FitPerson() {
				super();
				trackingNumber = 1;
				height = 70;
				iName = "Bob";
				iAge = 21;
			}
			
			/**
			 * Constructor using field
			 * @param trackingNumber
			 * @param height
			 */
			public FitPerson(String iName, int iAge, int trackingNumber, double height) {
				super();
				this.trackingNumber = trackingNumber;
				this.height = height;
				this.iName = iName;
				this.iAge = iAge;
			}


			public String getiName() {
				return iName;
			}

			public void setiName(String iName) {
				this.iName = iName;
			}

			public int getiAge() {
				return iAge;
			}

			public void setiAge(int iAge) {
				this.iAge = iAge;
			}

			public int getTrackingNumber() {
				return trackingNumber;
			}
			public void setTrackingNumber(int trackingNumber) {
				this.trackingNumber = trackingNumber;
			}
			public double getHeight() {
				return height;
			}
			public void setHeight(double height) {
				this.height = height;
			}
			
			@Override
			public String toString() {
				return super.toString() + " trackingNumber is " + trackingNumber + ", height is " + height + "";
			}	
			
			
		
}
