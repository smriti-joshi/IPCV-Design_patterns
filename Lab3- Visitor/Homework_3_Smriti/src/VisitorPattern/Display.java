package VisitorPattern;

public class Display implements Visitor {
    @Override
    public double visit(Multiply MulOperation) {
        System.out.print("(");
        MulOperation.getLeft().accept(this);
        System.out.print("*");
        MulOperation.getRight().accept(this);
        System.out.print(")");
        return 0;
    }

    @Override
    public double visit(Add AddOperation) {
        System.out.print("(");
        AddOperation.getLeft().accept(this);
        System.out.print("+");
        AddOperation.getRight().accept(this);
        System.out.print(")");
        return 0;
    }

    @Override
    public double visit(Number NumberOperand) {
       double a;
       a = NumberOperand.getNumber();
       System.out.print(a);
       return a;
    }


}
