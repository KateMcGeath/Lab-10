import org.junit.Assert;
import org.junit.Test;
public class RecursionTest {
	@Test
	public void testFactorial() {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	
	//TODO: GENERATE AND COMPLETE TESTS FOR ALL METHODS IN THE RECURSION CLASS.

}

