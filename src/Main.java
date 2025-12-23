import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    System.out.println("Задание №1");
    int firstFriday = 5;
    for (int i = firstFriday; i >= 1 && i <= 31; i += 7) {
        System.out.println(" Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
    }
    System.out.println("Задание №2");
    int passedDistance = 0;
    int totalDistance = 42_195;
    do {
        int i = totalDistance;
        passedDistance += 500;
        totalDistance -= passedDistance;
        System.out.println(" Держитесь! До конца дистанции осталось " + totalDistance + " метров.");
        totalDistance = i;
    }
    while ((totalDistance - 500) > passedDistance);
    System.out.println("Для цилка for:");
    int passedDistance1 = 0;
    int totalDistance1 = 42_195;
    for (int i = totalDistance1; i > passedDistance1; passedDistance1 += 500) {
        totalDistance1 -= passedDistance1;
        System.out.println(" Держитесь! До конца дистанции осталось " + totalDistance1 + " метров.");
        totalDistance1 = i;
    }
    System.out.println("Здание №3");
    int budget = 1000;
    int currentNumberOfDays = 0;
    int totalNumberOfDays = 0;
    System.out.println(" На сумму " + budget + " руб. вам доступно:");
    while (budget >= 100) {
        currentNumberOfDays += 1;
        totalNumberOfDays = currentNumberOfDays;
        if (currentNumberOfDays % 5 == 0) {
            continue;
        }
        budget -= 100;
    }
    System.out.println(" " + totalNumberOfDays + " дней парковки.");
    System.out.println("Для цилка for:");
    int budget1 = 1000;
    int currentNumberOfDays1 = 0;
    int totalNumberOfDays1 = 0;
    System.out.println(" На сумму " + budget1 + " руб. вам доступно:");
    for (; budget1 >= 100; currentNumberOfDays1++) {
        totalNumberOfDays1 = currentNumberOfDays1;
        if (currentNumberOfDays1 % 5 == 0) {
            continue;
        }
        budget1 -= 100;
    }
    System.out.println(" " + totalNumberOfDays1 + " дней парковки.");
    if (totalNumberOfDays == totalNumberOfDays1) {
        System.out.println(" Результаты обеих программ совпадают.");
    } else {
        System.out.println(" Результаты программ не совпадают.");
    }

    System.out.println("Задание №4");
    int month = 0;
    int total = 0;
    while (true) {
        month++;
        total += 15_000;
        if (month % 6 == 0) {
            total += total * 0.07;
        }
        System.out.println(" Месяц: " + month + " Сумма: " + total);
        if (total >= 12_000_000) {
            break;
        }
    }
    System.out.println("Задание №5");
    int charge = 20;
    int minute = 0;
    int overheats = 0;
    while (charge <= 100 && overheats <= 3) {
        minute++;
        if (minute % 10 == 0) {
            overheats++;
            System.out.println(" Зарядка прекращена из-за перегрева. Текущий заряд: " + charge + "%.");
            minute++;
            continue;
        }
        charge += 2;
        if (overheats > 3) {
            System.out.println(" Зарядка прекращена. Текущий заряд: " + charge + "%.");
            break;
        }
    }
    System.out.println(" Зарядка прекращена. Текущий заряд: " + charge + "%."); // я что-то совсем здесь запутался, при условии задачи, заряд не достигнет 100%, т.к. перегревов может быть максимум 4. Либо я что-то не так сделал
    System.out.println(minute + " " + charge + " " + overheats); // для себя написал, чтоб было видно
}