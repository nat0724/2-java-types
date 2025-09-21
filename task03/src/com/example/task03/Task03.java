package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        return centimetre/100;
    }

    public static void main(String[] args) {
        String input = System.console().readLine();
        int number = Integer.parseInt(input);
        System.out.println(getMetreFromCentimetre(number));
    }

}
