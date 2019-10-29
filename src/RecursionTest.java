import org.junit.Assert;

public class RecursionTest {

	public void testFactorial() {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	
	public void testFibonacci() {
		Recursion recursion = new Recursion();
		int expected = recursion.fibonacci(8);
		int actual = 13;
		Assert.assertEquals(expected, actual);
	}

	public void testNaryTreeSize() {
		Recursion recursion = new Recursion();
		int expected = recursion.nnaryTreeSize(4, 3);
		int actual = 21;
		Assert.assertEquals(expected, actual);
	}

}

