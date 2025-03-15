public class Main {
    public static void main(String[] args) {
        // Задача 1.
        System.out.println("\nЗадача 1.");
        System.out.println("Целые числа от 1 до 10:");
        for (int number = 1; number <= 10; number++) {
            System.out.print(" " + number);
        }
        // Задача 2.
        System.out.println("\nЗадача 2.");
        System.out.println("Целые числа от 10 до 1:");
        for (int number = 10; number >= 1; number--) {
            System.out.print(" " + number);
        }
        // Задача 3.
        System.out.println("\nЗадача 3.");
        System.out.println("Чётные числа от 1 до 17:");
        for (int number = 0; number <= 17; ++number) {
            if (number % 2 == 0) {
                System.out.print(" " + number);
            }
        }
        // Задача 4.
        System.out.println("\nЗадача 4.");
        System.out.println("Целые числа от 10 до -10:");
        for (int i = 10; i >= -10; i--) {
            System.out.print(" " + i);
        }
        // Задача 5.
        System.out.println("\nЗадача 5.");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 > 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
        // Задача 6.
        System.out.println("\nЗадача 6.");
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.print(" " + number);
        }
        // Задача 7.
        System.out.println("\nЗадача 7.");
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.print(" " + number);
        }
        // Задача 8.
        System.out.println("\nЗадача 8.");
        int totalSavings = 0;
        int monthSavings = 29000;
        for (int month = 1; month <= 12; month++) {
            totalSavings = totalSavings + monthSavings;
            System.out.println("Месяц " + month + ", Сумма накоплений равна "
                    + totalSavings + " рублей");
        }
        // Задача 9.
        System.out.println("\nЗадача 9.");
        double savingWithInterest = 0;
        double annualPercent = (double) 12 / 100;
        for (int month = 1; month <= 12; month++) {
            savingWithInterest+=monthSavings;
            savingWithInterest = savingWithInterest * (1 + annualPercent / 12);
            System.out.println("Месяц " + month + ", Сумма накоплений с процентами равна "
                    + savingWithInterest + " рублей");
        }
        // Задача 10.
        System.out.println("\nЗадача 10.");
        int staticMultiplier = 2;
        for (int dinamicMultiplier = 1; dinamicMultiplier <= 10; dinamicMultiplier++) {
            System.out.println(staticMultiplier + "*" + dinamicMultiplier + "="
                    + (staticMultiplier * dinamicMultiplier));
        }
    }
}