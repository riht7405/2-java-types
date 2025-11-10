package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num <= 127 & num >= -128)
            return "byte";
        else if (num <= 32767 & num >= -32768)
            return "short";
        else if (num <= 2147483647 & num >= -2147483648)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);


    }

}