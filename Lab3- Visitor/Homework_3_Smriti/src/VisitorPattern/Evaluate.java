package VisitorPattern;

public class Evaluate implements  Visitor {
    @Override
    public double visit(Multiply MulOperation) {
        double a,b,res;
        a = MulOperation.getLeft().accept(this);
        b = MulOperation.getRight().accept(this);
        res = a * b;
        return res;
    }

    @Override
    public double visit(Add AddOperation) {
        double a,b,res;
        a = AddOperation.getLeft().accept(this);
        b = AddOperation.getRight().accept(this);
        res = a + b;
        return res;
    }

    @Override
    public double visit(Number NumberOperand) {
        double a;
        a = NumberOperand.getNumber();
        return a;
    }
}
