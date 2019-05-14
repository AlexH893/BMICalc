import static org.junit.Assert.*;

import org.junit.Test;

public class DailyDataTest {

	@Test
	public void test() {
		DailyData myData = new DailyData(0, 0, 0);
		assertEquals(1000, myData.getSteps(), .01);
		assertEquals(2, myData.getTrackingNumber());
		assertEquals(150, myData.getWeight(), .01);
	}

}
