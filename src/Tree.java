import java.util.ArrayList;
public class Tree {
	
	 /**
     * Class that represents a tree. This is a data structure comprised of several nodes. Each node may
     * have some number of "child" nodes. These are linked to via its "children" lists. Each node also
     * contains a value. Some trees are sorted; that is, the values are placed in the tree in a way
     * that orders them. In this tree, each node may have any number of children, which in turn are
     * all nodes (trees) that may have any number of children.
     * 
     * You might construct a tree as such:
     *      Tree root = new Tree(5);
     *  
     *      Tree child1 = new Tree(7);
     *      Tree child2 = new Tree(8);
     *  
     *      root.add(child1);
     *      root.add(child2);
     *      
     * THIS CLASS IS PROVIDED FOR YOU. YOU SHOULD NOT CHANGE IT!
     * 
     * @author Stephen
     * @version 2018-04-23
     * @author Feras
     * @modified 2019-10-23
     */

    private ArrayList<Tree> children;
    private int value;

    public Tree(int value)
    {
        this.value = value;
        children = new ArrayList<Tree>();

        //TODO
    }

    public int getValue()
    {
        return value;

        //TODO
    }

    public ArrayList<Tree> getChildren()
    {
        return children;

    }

    public void add(Tree child)
    {
        //TODO
        children.add(child);

    }
}

