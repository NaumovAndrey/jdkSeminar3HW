package ru.gb;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Задание 1: Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(), multiply(), divide(), subtract().
         * Параметры этих методов – два числа разного типа, над которыми должна быть произведена операция.
         */
//        System.out.println(Calculator.sum(2, 3));
//        System.out.println(Calculator.difference(5, 2));
//        System.out.println(Calculator.mul(5, 3));
//        System.out.println(Calculator.div(8, 3));
//        System.out.println(Calculator.div(8, 0));

        /**
         * Задание3: Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае.
         * Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа.
         */
//        Integer[] arr1 = new Integer[10];
//        Integer[] arr2 = new Integer[10];
//        Float[] arr3 = new Float[10];
//        String[] arr4 = new String[10];
//        String[] arr5 = new String[5];
//        String[] arr6 = new String[5];
//
//
//        System.out.println("одинаковые: " + compareArrays(arr1, arr2));
//        System.out.println("разные: " + compareArrays(arr1, arr3));
//        System.out.println("разные: " + compareArrays(arr1, arr4));
//        System.out.println("разные: " + compareArrays(arr4, arr5));
//        System.out.println("одинаковые: " + compareArrays(arr5, arr6));

        /**
         * Задание 4. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
         * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
         * а также переопределение метода toString(), возвращающее строковое представление пары.
         */
        System.out.println(new Pair<String, Integer>("key", 100));



    }

    //region Задание 3 решение
    public static <T> boolean compareArrays(T[] arr1, T[] arr2){
        Class<?> type1 = arr1.getClass().getComponentType();
        Class<?> type2 = arr2.getClass().getComponentType();
        return (arr1.length == arr2.length) && (type1.equals(type2)); //проверяем на одинаковую длину и одинаковый тип данных
    }
    //endregion
}