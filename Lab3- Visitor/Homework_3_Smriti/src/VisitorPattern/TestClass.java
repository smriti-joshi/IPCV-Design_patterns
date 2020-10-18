package VisitorPattern;

public class TestClass {
    public static void main(String args[])
    {
        double result;
        //Binary Tree Formation
        BinaryTree expression = new Add(new Number(3), new Multiply(new Number(5), new Number(6)));

        System.out.println("\nDisplaying the expression");
        //New visitor object for Display
        Visitor object = new Display();
        expression.accept(object);
        System.out.println("\n\nDisplaying the result");

        //New Visitor Object for Evaluation
        Visitor object_two = new Evaluate();
        result = expression.accept(object_two);
        System.out.println(result);
    }
}
