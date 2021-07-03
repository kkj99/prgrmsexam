import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class guessCollatzTest
{

	@DataProvider
	public static Object[][] dataProvider()
	{
		return new Object[][]{
				new Object[]{6,8},
				new Object[]{16,4},
				new Object[]{626331,-1}
		};
	}

	@Test(dataProvider = "dataProvider")
	public void testSolution(int num, int result)
	{
		GuessCollatz s = new GuessCollatz();
		assertEquals(s.solution(num), result);
	}
}