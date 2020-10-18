package VisitorPattern;

public interface BinaryTree {
    public double accept(Visitor visitor);
    public  BinaryTree getLeft();
    public  BinaryTree getRight();
}
