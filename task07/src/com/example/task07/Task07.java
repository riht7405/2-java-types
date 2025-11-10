package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int Row = n / k;
        int Column = m / k;
        return Row * Column;
    }

    public static void main(String[] args) {
        int result = solution(20, 50, 3);
        System.out.println(result);
    }
}