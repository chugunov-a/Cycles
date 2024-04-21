public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            int deposit = 15000;
            int total = 0;
            int goal = 2_459_000;
            int monthNumber = 1;
            while (total <= goal) {
                total = total + deposit;
                total = total + total / 100;
                int i = monthNumber++;
                System.out.println(" Месяц " + i + ", сумма накоплений равна " + total);
            }
        }
        System.out.println("Задание 2");
        {
            int i = 1;
            while (i > 0 && i < 11) {
                System.out.print(" " + i);
                i++;
            }
            System.out.println();
            for (i = 10; i > 0 && i < 11; ) {
                System.out.print(" " + i);
                i--;
            }
        }
        System.out.println("\nЗадание 3");
        {
            int population = 12_000_000;
            float birthRate = 17;
            birthRate = birthRate / 1000f;
            float deathRate = 8;
            deathRate = deathRate / 1000f;
            int populationGrowth = (int) ((population * birthRate) - (population * deathRate));
            int year = 2024;
            int checkYear = year + 11;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year = year + 1;
            for (; year < checkYear; year++) {
                population = population + populationGrowth;
                System.out.println("Год " + year + ", численность населения составляет " + population);
            }
        }
        System.out.println("Задание 4");
        {
            int goal = 12_000_000;
            int deposit = 15000;
            int depositRate = 7;
            int totalSavings = 0;
            int monthNumber = 1;
            while (totalSavings <= goal) {
                totalSavings = totalSavings + deposit;
                totalSavings = totalSavings + totalSavings / 100 * depositRate;
                int i = monthNumber++;
                System.out.println(" Месяц " + i + ", сумма накоплений равна " + totalSavings);
            }
        }
        System.out.println("Задание 5");
        {
            int goal = 12_000_000;
            int deposit = 15000;
            int depositRate = 7;
            int totalSavings = 0;
            int monthNumber = 1;
            while (totalSavings <= goal) {
                totalSavings = totalSavings + deposit;
                totalSavings = totalSavings + totalSavings / 100 * depositRate;
                int i = monthNumber++;
                if (i % 6 == 0) {
                    System.out.println(" Месяц " + i + ", сумма накоплений равна " + totalSavings);
                }
            }
        }
        System.out.println("Задание 6");
        {
            int goal = 9 * 12;
            int deposit = 15000;
            int depositRate = 7;
            int totalSavings = 0;
            int monthNumber = 1;
            while (monthNumber <= goal) {
                totalSavings = totalSavings + deposit;
                totalSavings = totalSavings + totalSavings / 100 * depositRate;
                int i = monthNumber++;
                if (i % 6 == 0) {
                    System.out.println(" Месяц " + i + ", сумма накоплений равна " + totalSavings);
                }
            }
        }
        System.out.println("Задание 7");
        {
            int firstFriday = 5;
            int secondFriday = firstFriday + 7;
            int thirdFriday = secondFriday + 7;
            int fourthFriday = thirdFriday + 7;
            int daysAmount = 31;
            int date = 0;
            while (date <= daysAmount) {
                date++;
                if (date == firstFriday || date == secondFriday || date == thirdFriday || date == fourthFriday) {
                    System.out.println(" Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
                } // else { System.out.println (" Сегодня не пятница"); }
            }
        }
        System.out.println("Задание 8");
        {
            int year = 2024;
            int start = year - 200;
            int end = year + 100;
            for (int i = start; i <= end; i++) {
                if (i % 79 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}