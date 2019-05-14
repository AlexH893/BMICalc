import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * This will do calculations, the do again loop, and return the status for BMIControl
 * @author Alex
 * Date written 5/2/2016
 */
public class BMICalculator {
	 int weight;
	 int height;
	
		
/**
 * This is the actual calculation formula for the BMI. It calculates and also returns it.
 * @return 
 * @return 
 */
	public double getBMI() {
	double answer = 0;
	DecimalFormat df = new DecimalFormat("0.00");
	answer = weight / Math.pow((height / 100.0), 2);	
	return answer;
	}
	
	
	/**
	 * Default constructor
	 */
	public BMICalculator() {
		weight = 0;
		height = 0;	
		weight = 0;
		height = 0;
	}
	
	/**
	 * Constructor using fields
	 * @param iWeight
	 * @param iHeight
	 */
	public BMICalculator(int iWeight, int iHeight) {
		this.weight = iWeight;
		this.height = iHeight;

	}
	
	public int getWeight() {
		return weight;
	}
	


	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
	
	
	public void setWeightInPounds(int weight) {
		this.weight = (int) (weight / 2.2); //converting the weight to english
	}
	
	public void setHeightInInches(int height) {
		this.height = (int) (height * 2.54); 	//converts to the height to english
	}
	

	
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	


	/**
	 * Returns a status based on the calculated BMI
	 * @param BMI
	 * @return
	 */
	
	public String getStatus() {
		double BMI = getBMI();
		String status = null;
		if (BMI < 20) {
			status = "low";
		}
		else
			 if (BMI > 20 && BMI < 26 ) {
					status = "normal";
			 }
			 else {			 
					status = "high";					
				}
			return status;
	} //end of getStatus
	

	
	
	
/**
 * Converts the object values into a String
 */
	public String toString(double BMI) {
		return "Hello, your BMI is" + BMI + "which is " + getStatus();
				
	}
	
		
	/**
	 * This method will return true if the user wants to do the process again.
	 * It will use message boxes to ask the user to do the process again.
	 * @return
	 */
	public static boolean DoAgainMessageBox() { 
		boolean answer = true;
		String input = null;
		
		input = JOptionPane.showInputDialog(null, "Do you want to run the program again?");		
		if (input.equals("yes")) {						
			answer = true;
		} else if(input.equals("no")) {
			answer = false;
		} else
			input = JOptionPane.showInputDialog(null, "Please answer using 'yes' or 'no'.");		
		return answer;
		
	}
		

}
