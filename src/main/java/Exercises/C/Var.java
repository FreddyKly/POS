package Exercises.C;

public class Var implements ArithmeticExpr{
    String name;

    Var(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

    public Const eval(Environment env) {
        return env.lookup(name);
    }
}
