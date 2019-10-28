
/**
 * @author Feras salous
 * @version 2019-10-23
 * This is where all methods are being ran, feel free to modify it as you would like to experiment with 
 * the methods you have implemented.
 */
public class Driver {

	public static void main(String[] args) {
		Recursion recursion = new Recursion();
		//PRINT THE FACTORIAL OF 10
		System.out.println("10!= " + recursion.factorial(10));
		//Print The Fibonacci Sequence Until 20
		System.out.println("The Fibonacci Sequence up until n=100 is: " + recursion.fibonacci(20));
		
		//Create A root node in the tree with value 5
		Tree tree = new Tree(5);
		//Create 4 Children to add to the tree
		Tree child1 = new Tree(22);
		Tree child2 = new Tree(100);
		Tree child3 = new Tree(16);
		Tree child4 = new Tree(102);
		
		//Add children to the tree.
		tree.add(child1);
		tree.add(child2);
		tree.add(child3);
		tree.add(child4);
		//Print out Tree Sum for example here it is: 5 + 22 + 100+ 16 + 102 = 245.
		System.out.println(recursion.treeSum(tree));
		
		//Test CircleSquared
		System.out.println(recursion.circledSquared(true, 12, 9));
		

		
		
		
	}

}
