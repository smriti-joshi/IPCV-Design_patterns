package VisitorPattern;

public class  Number implements BinaryTree {
    protected  double number;
    public Number(int number)
    {
        this.number = number;
    }
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
    public double getNumber()
    {
        return number;
    }

    //Number would always be leaf node. Left and right are null
    public BinaryTree getLeft()
    {return null;}
    public BinaryTree getRight()
    {return null;}
}
