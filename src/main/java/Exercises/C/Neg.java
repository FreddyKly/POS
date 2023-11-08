package Exercises.C;

public class Neg implements ArithmeticExpr {
    ArithmeticExpr num;

    Neg(Const n) {
        num = n;
    }

    @Override
    public Const eval(Environment env) {
        return new Const(-1 * num.eval(env).getValue());
    }
}
