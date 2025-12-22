import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main() {
    System.out.println("Задание №1");
    int FirstFriday = 5;
    for (int i = FirstFriday; i >= 1 && i <= 31; i += 7) {
        System.out.println(" Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
    }
    System.out.println("Задание №2");
    int PassedDistance = 0;
    int TotalDistance = 42_195;
    do {
        int i = TotalDistance;
        PassedDistance += 500;
        TotalDistance -= PassedDistance;
        System.out.println(" Держитесь! До конца дистанции осталось " + TotalDistance + " метров.");
        TotalDistance = i;
    }
    while (PassedDistance <= (TotalDistance - 500));
    System.out.println("Для цилка for:");
    int PassedDistance1 = 0;
    int TotalDistance1 = 42_195;
    for (int i = PassedDistance1; i <= TotalDistance1; i += 500) {
        System.out.println(" Держитесь! До конца дистанции осталось " + (TotalDistance1 - i) + " метров.");
        // Не понимаю, почему не меняется значение переменной TotalDistance1 после объявления цикла for
        // Пишу: TotalDistance1 -= PassedDistance1;
        // sout "..." + TotalDistance1 + " метров.")
        // При такой записи значение TotalDistance1 почему то не изменяется на -= PassedDistance1. Объясните, пожалуйста!)
    }
    System.out.println("Здание №3");
    int Budget = 1000;
    int CurrentNumberOfDays = 0;
    int TotalNumberOfDays = 0;
    System.out.println(" На сумму " + Budget + " руб. вам доступно:");
    while (Budget >= 100) {
        CurrentNumberOfDays += 1;
        TotalNumberOfDays = CurrentNumberOfDays * 1;
        if (CurrentNumberOfDays % 5 == 0) {
            continue;
        }
        Budget -= 100;
    }
    System.out.println(" " + TotalNumberOfDays + " дней парковки.");
    System.out.println("Для цилка for:");
    int Budget1 = 1000;
    int CurrentNumberOfDays1 = 0;
    int TotalNumberOfDays1 = 0;
    System.out.println(" На сумму " + Budget1 + " руб. вам доступно:");
    for (; Budget1 >= 100; CurrentNumberOfDays1++) {
        TotalNumberOfDays1 = CurrentNumberOfDays1 * 1;
        if (CurrentNumberOfDays1 % 5 == 0) {
            continue;
        }
        Budget1 -= 100;
    }
    System.out.println(" " + TotalNumberOfDays1 + " дней парковки.");
    System.out.println("Задание №4");
    int Month = 0;
    int Total = 0;
    while (true) {
        Month++;
        Total += 15_000;
        if (Month % 6 == 0) {
            Total += Total * 0.07;
        }
        System.out.println(" Месяц: " + Month + " Сумма: " + Total);
        if (Total >= 12_000_000) {
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
