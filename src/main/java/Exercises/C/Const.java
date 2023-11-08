package Exercises.C;

public class Const implements ArithmeticExpr{
    // fields
    private int value;

    // constructor 
    Const(int v) {
        value = v;
    }

    // getters
    int getValue() {
        return value;
    }

    //  toString
    public String toString() {
        return Integer.toString(value);
    }

    public Const eval() {
        return this;
    }
}
