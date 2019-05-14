

import static org.junit.Assert.*;

import org.junit.Test;

public class FitPersonTest {

	@Test
	public void testTrackingNumber() {
		 FitPerson myPerson = new FitPerson();
		assertEquals(1, myPerson.getTrackingNumber());
		assertEquals(70, myPerson.getHeight(), .01);
	}

}
