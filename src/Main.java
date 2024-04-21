public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        {
            for (byte i = 1; i <= 10 && i != 0; i++) {
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\nЗадача 2");
        {
            for (byte i = 10; i >= 1; i--) {
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\nЗадача 3");
        {
            for (int i = 0; i < 17 && i >= 0; i = i + 2) {
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\nЗадача 4");
        {
            for (int i = 10; i <= 10 && i >= -10; i--) {
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\nЗадача 5");
        {
            for (int i = 1904; i >= 1904 && i <= 2096; i = i + 4) {
                System.out.println(i + " год является високосным");
            }
        }
        System.out.println("Задание 6");
        {
            for (int i = 7; i >= 7 && i <= 98; i= i + 7) {
                System.out.printf(" %d", i);
        }
        }
        System.out.println("\nЗадание 7");
        {
            for (int i = 1; i >= 1 && i <= 512; i = i * 2) {
                System.out.printf(" %d", i);
            }
        }
        System.out.println("\nЗадание 8");
        {
           int deposit = 29000;
           int total = 0;
           for (int i = 1; i >=1 && i <= 12; i++) {
               total = total + deposit;
               System.out.println(" Месяц " + i + ", сумма накоплений равна " + total);
           }
        }
        System.out.println("Задание 9");
        {
            int deposit = 29000;
            int total = 0;
            for (int i = 1; i >=1 && i <= 12; i++) {
                total = total + total / 100;
                total = total + deposit;
                System.out.println(" Месяц " + i + ", сумма накоплений равна " + total);
            }
        }
        System.out.println("Задание 10");
        {
            for (int i = 1; i > 0 && i < 11; i++) {
                int i1 = 2 * i;
                System.out.println(" 2 * " + i + " = " + i1);
            }
        }
        }
    }