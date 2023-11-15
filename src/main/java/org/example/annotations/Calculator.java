package org.example.annotations;

import java.lang.reflect.Method;

/**
 * калькулятор з використанням анотацій
 */
public class Calculator {
    /**
     * конструктор за замовчуванням
     * */
    public Calculator() {
    }

    /**
     * метод додавання
     * */
    @CalculatorValues(value1 = 1, value2 = 2)
    public void add() throws NoSuchMethodException {
        Method method = Calculator.class.getMethod("add");
        CalculatorValues annoValues = method.getAnnotation(CalculatorValues.class);

        System.out.println("method add() => " + (annoValues.value1() + annoValues.value2()) );
    }
    /**
     * метод віднімання
     * */
    @CalculatorValues(value1 = 3, value2 = 4)
    public void subtract() throws NoSuchMethodException {
        Method method = Calculator.class.getMethod("subtract");
        CalculatorValues annoValues = method.getAnnotation(CalculatorValues.class);

        System.out.println("method subtract() => " + (annoValues.value1() - annoValues.value2()) );
    }
    /**
     * метод множення
     * */
    @CalculatorValues(value1 = 5, value2 = 6)
    public void multiply() throws NoSuchMethodException {
        Method method = Calculator.class.getMethod("multiply");
        CalculatorValues annoValues = method.getAnnotation(CalculatorValues.class);

        System.out.println("method multiply() => " + (annoValues.value1() * annoValues.value2()) );
    }
    /**
     * метод ділення
     * */
    @CalculatorValues(value1 = 7, value2 = 8)
    public void divide() throws NoSuchMethodException {
        Method method = Calculator.class.getMethod("divide");
        CalculatorValues annoValues = method.getAnnotation(CalculatorValues.class);

        System.out.println("method divide() => " + (annoValues.value1() / annoValues.value2()) );
    }
}