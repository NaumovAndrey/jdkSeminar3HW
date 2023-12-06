package ru.gb;
/*Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
*/
public class Calculator {
    public static <T extends Number> double sum(T meaning1, T meaning2){
        return meaning1.doubleValue() + meaning2.doubleValue();
    }

    public static <T extends Number> double difference(T meaning1, T meaning2){
        return meaning1.doubleValue() - meaning2.doubleValue();
    }

    public static <T extends Number> double mul(T meaning1, T meaning2){
        return meaning1.doubleValue() * meaning2.doubleValue();
    }

    public static <T extends Number> double div(T meaning1, T meaning2){
        if (meaning2.doubleValue() == 0){
            throw new ArithmeticException("Ошибка ввода (деление на ноль)");
        }
        return meaning1.doubleValue() / meaning2.doubleValue();
    }
}
