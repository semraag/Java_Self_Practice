package day06_practice_tasks;

public class DayAndMonth {
    public static void main(String[] args) {
        day(5);
        monthName(6); System.out.print(" has "); daysInMonth(6);

    }

    public static void day(int num) {
        if (num < 1 || num > 7) {
            System.err.println("Invalid Number");
        }
        System.out.println((num == 1) ? "Monday" : (num == 2) ? "Tuesday" : (num == 3) ? "Wednesday" :
                (num == 4) ? "Thursday" : (num == 5) ? "Friday" : (num == 6) ? "Saturday" : "Sunday");
    }
    public static void monthName(int month) {
        String monthName = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Number";
        };
        System.out.print(monthName);
    }

    public static void daysInMonth(int month) {
        if (month < 1 || month > 12) {
            System.err.println("Invalid Number");
            return;
        }
        String daysInMonth = switch (month) {

            case 1, 3, 5, 7, 8, 10, 12 -> "31 Days";
            case 4, 6, 9, 11 -> "30 Days";
            case 2 -> "28 Days";
            default -> "Invalid Number";
        };
        System.out.println(daysInMonth);
    }
}
