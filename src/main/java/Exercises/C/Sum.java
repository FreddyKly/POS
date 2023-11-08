package Exercises.C;

public class Sum {
    ArithmeticExpr left;
    ArithmeticExpr right;

    Sum(Const l, Const r) {
        left = l;
        right = r;
    }

    Const eval() {
        return new Const((left.eval().getValue()) + (right.eval().getValue()));
    }
}
