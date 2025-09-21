package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int length = n/k;
        int width = m/k;
        return length*width;

    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
