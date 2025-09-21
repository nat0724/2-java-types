package com.example.task14;

public class Task14 {


    public static int reverse(int value) {

        String str = Integer.toString(value);
        String str2 = new StringBuilder(str).reverse().toString();
        return Integer.parseInt(str2);
    }

    public static void main(String[] args) {

        int result = reverse(345);
        System.out.println(result);

    }


}
