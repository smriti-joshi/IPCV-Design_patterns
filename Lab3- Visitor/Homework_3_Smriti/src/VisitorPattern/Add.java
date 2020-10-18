package VisitorPattern;

public class Add implements BinaryTree {
    protected BinaryTree left;
    protected BinaryTree right;
    public Add(BinaryTree left,BinaryTree right)
    {
       this.left = left;
       this.right = right;
    }
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public BinaryTree getLeft()
    {
        return left;
    }
    public BinaryTree getRight()
    {
        return  right;
    }
}
