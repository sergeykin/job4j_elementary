package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int rubles = 420;
        int euro = Converter.rubleToEuro(rubles);
        int dollar = Converter.rubleToEuro(rubles);
        System.out.println(String.valueOf(rubles) + " rubles are " + euro + " euro.");
        System.out.println(String.valueOf(rubles) + " rubles are " + dollar + " dollar.");

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        expected = 2;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
