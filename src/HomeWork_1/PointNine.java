package HomeWork_1;

public class PointNine {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Пример использования
//    int year = 2024;
//    boolean isLeap = isLeapYear(year);
//System.out.println(year + " is leap year: " + isLeap); // Выведет "2024 is leap year: true"

    }

