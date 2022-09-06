import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsLeap(2020);
        printInstallationMessage(1, 2020); //alt + enter - idea сгенерирует метод
        printCalculateDeliveryDays (95);

    }

    private static void printIsLeap(int year) {
        System.out.println("ЗАДАНИЕ 1");
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//параметры високосного года
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }

    public static void printInstallationMessage(int os, int productionYear) {
        System.out.println("ЗАДАНИЕ 2");
        if (!(os == 0 || os == 1)) {
            throw new RuntimeException("Не поддерживаемое устройство");
        }
        int currentYear = LocalDate.now().getYear();

        String versionMessage = productionYear < currentYear ? "облегченную" : "";
        String osMessage = os == 0 ? "iOs" : "Android";

        System.out.printf("Установите %s версию приложения для %s по ссылке", versionMessage, osMessage);
    }

    public static void printCalculateDeliveryDays(int distance) {
        System.out.println("");
        System.out.println("ЗАДАНИЕ 3");
        System.out.println( "//ЧТО ТАКОЕ Math.abs и ПОЧЕМУ НЕ ОБЪЯСНИЛИ НА РАЗБОРЕ ДЗ, А ПРОСТО СКОПИРОВАЛИ ЧУЖОЙ КОД???\n" +
                "//ЗАЧЕМ БЫЛО ТРАТИТЬ 40 МИН НА *ДЕБРИ*, А ПОТОМ МОЛЧА И БЕЗ ОБЪЯСНЕНИЙ СДЕЛАТЬ ЗАДАНИЯ???\n" +
                "МОЖНО НА РАЗБОРЕ ДЗ СНАЧАЛА КРАТКО И ПОНЯТНО ОБЪЯСНЯТЬ ПРОСТЫЕ РЕШЕНИЯ, А ТОЛЬКО ПОТОМ ЛЕЗТЬ В *ДЕБРИ* ДЛЯ ОСОБО ИНТЕРЕСУЮЩИХСЯ?" );
        int start = 20;
        int step = 40;
        int result;
        if (distance < start) {
            result = 1;
        } else {
            result = (Math.abs((distance - start) / step) + 2); //ЧТО ТАКОЕ
        }
        System.out.println( "Потребуется для доставки дней: " + result);
    }
}





