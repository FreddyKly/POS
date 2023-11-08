package Exercises.C;

public class Prod implements ArithmeticExpr{
    ArithmeticExpr left;
    ArithmeticExpr right;

    Prod(Const l, Const r) {
        left = l;
        right = r;
    }

    public Const eval(Environment env) {
        return new Const((left.eval(env).getValue()) * (right.eval(env).getValue()));
    }
}
