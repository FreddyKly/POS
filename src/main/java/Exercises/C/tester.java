package Exercises.C;

public class tester {
    public static void main(String[] args) {
        Const first = new Const(3);
        Const second = new Const(5);
        System.out.println(new Sum(first, second).eval().toString());
    }
}
