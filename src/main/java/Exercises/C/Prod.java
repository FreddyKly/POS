package Exercises.C;

public class Prod implements ArithmeticExpr{
    ArithmeticExpr left;
    ArithmeticExpr right;

    Prod(Const l, Const r) {
        left = l;
        right = r;
    }

    public Const eval() {
        return new Const((left.eval().getValue()) * (right.eval().getValue()));
    }
}
