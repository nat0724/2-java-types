package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x+y;
        int result = 0;
        while (sum>0) {
            result+=(sum%10);
            sum/=10;
        }

        return result;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
