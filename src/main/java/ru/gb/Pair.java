package ru.gb;

/**
 * Задание 4. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений пары,
 * а также переопределение метода toString(), возвращающее строковое представление пары.
 */

public class Pair <T, U> {
    T t;
    U u;

    public Pair(T t, U u) {
        this.t = t;
        this.u = u;
    }

    void getFirst(){

    }

    void  getSecond(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
