package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 420;
        int euro = Converter.rubleToEuro(rubles);
        int dollar = Converter.rubleToEuro(rubles);
        System.out.println(String.valueOf(rubles)+" rubles are " + euro + " euro.");
        System.out.println(String.valueOf(rubles)+" rubles are " + dollar + " dollar.");
    }
}
