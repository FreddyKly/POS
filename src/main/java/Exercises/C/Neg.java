package Exercises.C;

public class Neg implements ArithmeticExpr {
    ArithmeticExpr num;

    Neg(Const n) {
        num = n;
    }

    @Override
    public Const eval() {
        return new Const(-1 * num.eval().getValue());
    }
}
