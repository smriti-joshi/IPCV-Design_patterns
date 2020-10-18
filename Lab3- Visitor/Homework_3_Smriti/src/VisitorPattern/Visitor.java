package VisitorPattern;

public interface Visitor {
    public double visit(Multiply MulOperation);
    public double visit(Add AddOperation);
    public double visit(Number NumberOperand);
}
