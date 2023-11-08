package Exercises.C;

import java.util.HashMap;

public class Environment {
    HashMap<String, Const> variables = new HashMap<String, Const>();

    Const lookup(String name) {
       return variables.get(name);
    }

    void put(String name, Const value) {
        variables.put(name, value);
    }
}
