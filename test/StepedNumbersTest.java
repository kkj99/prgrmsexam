import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StepedNumbersTest
{

	@DataProvider
	public static Object[][] dataProvider()
	{
		return new Object[][]{
				new Object[]{2,5,new long[]{2, 4, 6, 8, 10}}
				,new Object[]{4,3,new long[]{4, 8, 12}}
				,new Object[]{-4,2,new long[]{-4,-8}}
		};
	}

	@Test(dataProvider = "dataProvider")
	public void testSolution(int x, int n, long[] result)
	{
		StepedNumbers s = new StepedNumbers();
		assertEquals(s.solution(x, n), result);
	}
}