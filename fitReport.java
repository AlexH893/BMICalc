import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * This control program will write a report to the console
 *
 * @author Alex
 *
 */
public class fitReport {

	public static void main(String[] args) {
		boolean eof = false;
		List<FitPerson> myList = null;
		myList = new LinkedList<FitPerson>();
		
		List<DailyData> myList2 = null;
		myList2 = new LinkedList<DailyData>();
		input(myList, myList2);
		output(myList, myList2);
		
	}

	private static void input(List<FitPerson> myList, List<DailyData> myList2) {	
		boolean eof = false;
		
		String data, record;
		
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("fitperson.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File error");
		}
		
		scanner.useDelimiter("\r\n");

		while(scanner.hasNext()){
			FitPerson fp = new FitPerson();
			record = scanner.next();
			String iName = record.substring(0, 19);
			fp.setName(iName);
			
			data = record.substring(19, 21);
			int iAge = Integer.parseInt(data.trim());
			fp.setAge(iAge);
			
			String iGender = record.substring(21, 22);	
			fp.setGender(iGender.charAt(0));
			
			data = record.substring(22, 24);		
			int iTrackingNum = Integer.parseInt(data.trim());
			fp.setTrackingNumber(iTrackingNum);
			
			data = record.substring(24, 26);
			int iHeight = Integer.parseInt(data.trim());
			fp.setHeight(iHeight);

			myList.add(fp);
					
		}
		
		
		
		
	/**
	 * Dailydata	
	 */
		
		
		try {
			scanner = new Scanner(new File("dailydata.dat"));
		} catch (FileNotFoundException e) {
			System.out.println("File error");
		}

		
		while(scanner.hasNext()) {
			record = scanner.next();
			data = record.substring(0, 2);		
			int iTrackingNum = Integer.parseInt(data.trim());

			data = record.substring(2, 5);
			int iWeight = Integer.parseInt(data.trim());
			
			data = record.substring(5, 10);
			int iSteps = Integer.parseInt(data.trim());
			
			
			DailyData dt = new DailyData(iTrackingNum, iWeight, iSteps);
			dt.setSteps(iSteps);
			dt.setTrackingNumber(iTrackingNum);
			dt.setWeight(iWeight);
			
			myList2.add(dt);

			

		}
		
		
	}
	
	private static void output(List<FitPerson> myList, List<DailyData> myList2) {
		

		System.out.println("Fit Person");
		System.out.println(" ");
		for( FitPerson  fp :  myList ){		
			System.out.println(fp);
	}
		System.out.println(" ");
		System.out.println("Daily Data");
		System.out.println(" ");
		
		for( DailyData  dt :  myList2 ){		
			System.out.println(dt);
	}
		
		
		
		
		
		
		
		
	}
	
	
}
