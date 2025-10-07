package com.example.task04;

import java.util.Objects;

public class Task04 {

    public static float calculate(int a, int b, String operation) {

        if (Objects.equals(operation, "+")) return a+b;
        if (Objects.equals(operation, "-")) return a-b;
        if (Objects.equals(operation, "*")) return a*b;
        if (Objects.equals(operation, "/")) return (float) a /b;


        return 0;
    }

    public static void main(String[] args) {

        float result = calculate(-25, 5, "/");
        System.out.println(result);

    }

}
