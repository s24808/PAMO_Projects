package com.example.bmicalculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class BMICalculatorTest {

    //Logika testu
    public double calculateBMI(double weightKg, double heightCm) {
        double heightM = heightCm / 100.0;
        return weightKg / (heightM * heightM);
    }

    @Test
    public void testCalculateBMI_normalRange() { //Test prawidłowej wagi
        double bmi = calculateBMI(70, 175); //Dane
        assertEquals(22.86, bmi, 0.1); //Sprawdzenie czy warunki sa spełnione
    }

    @Test
    public void testCalculateBMI_underweight() { //Test niedowaga
        double bmi = calculateBMI(45, 160); //Dane
        assertTrue(bmi < 18.5); //Sprawdzenie czy warunki sa spełnione
    }

    @Test
    public void testCalculateBMI_overweight() {//Test niedowaga
        double bmi = calculateBMI(90, 170); //Dane
        assertTrue(bmi >= 25); //Sprawdzenie czy warunki sa spełnione
    }
}