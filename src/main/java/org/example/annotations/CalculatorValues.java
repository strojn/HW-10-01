package org.example.annotations;

import java.lang.annotation.*;

/**
 * анотація передає 2 параметри
 * для методів класу Calculator
 * */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface CalculatorValues {
    /**
     * перше число для калькулятора
     * */
    double value1();
    /**
     * друге число для калькулятора
     * */
    double value2();
}
