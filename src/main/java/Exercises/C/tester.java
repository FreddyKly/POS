package Exercises.C;

public class tester {
    public static void main(String[] args) {
        Environment env = new Environment();
        Const first = new Const(3);
        Const second = new Const(4);
        Const third = new Const(5);
        System.out.println(
            new Neg(
                new Prod(
                    new Sum(
                        first, second)
                        .eval(), third)
                        .eval(env))
                        .eval(env).toString());
    }
}
