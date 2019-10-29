

public class RecursionTest {

	public void testFactorial() throws AssertException {
		Recursion recursion = new Recursion();
		int expected = recursion.factorial(10);
		int actual = 3628800;
		Assert.assertEquals(expected, actual);
	}
	
	public void testFibonacci() throws AssertException {
		Recursion recursion = new Recursion();
		int expected = recursion.fibonacci(8);
		int actual = 21;
		Assert.assertEquals(expected, actual);
	}

	public void testNaryTreeSize() throws AssertException {
		Recursion recursion = new Recursion();
		int expected = recursion.nnaryTreeSize(4, 3);
		int actual = 21;
		Assert.assertEquals(expected, actual);
	}

	public void testTreeSum() throws AssertException {
		Recursion recursion = new Recursion();
		Tree tree = new Tree(5);
		Tree child1 = new Tree(7);
		Tree child2 = new Tree(8);
		tree.add(child1);
		tree.add(child2);
		
		int expected = recursion.treeSum(tree);
		int actual = 20;
		Assert.assertEquals(expected, actual);
	}
	
	public void testCircledSquare() throws AssertException {
		Recursion recursion = new Recursion();
		double expected = recursion.circledSquared(true, 12, 9);
		double actual = 52.0;
		Assert.assertEquals(expected, actual, 1);
	}
}

