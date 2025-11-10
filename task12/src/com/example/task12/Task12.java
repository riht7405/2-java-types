package com.example.task12;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Task12 {

    public static BigDecimal benefit(BigDecimal sum, BigDecimal percent) {

        BigDecimal multiplier = BigDecimal.ONE.add(percent)
                .pow(12, new MathContext(20, RoundingMode.HALF_UP));
        return sum.multiply(multiplier).setScale(9, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(500).setScale(9, RoundingMode.HALF_UP); // 500 руб. на счете
        BigDecimal percent = new BigDecimal("0.00000001").setScale(9, RoundingMode.HALF_UP); // 0.000001% ежемесячно

        sum = benefit(sum, percent);

        System.out.println("Сумма на счете через год: " + sum);

    }

}