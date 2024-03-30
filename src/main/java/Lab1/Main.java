package Lab1;

import java.util.Arrays;
import java.util.Random;

class Task2 {
    public static void main(String[] args) {
        int year = 2024;
        Random random = new Random();
        int dayNum =
                random.nextInt(365) + 1;

        System.out.print(year + " " + dayNum + " ");
//        int year = 1999;
//        int dayNum = 91;
//        int year = 2000;
//        int dayNum = 91;


        final int[] daysInMonths = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31};
        final String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        int monthNum = 0;
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0) || year % 400 == 0);


        for (int days : daysInMonths) {
            if (isLeapYear && days == 28) {
                days = days + 1;
            }
            if (dayNum <= days) {
                break;
            }
            dayNum = dayNum - days;
            monthNum = monthNum + 1;
        }
        System.out.println(Arrays.toString(new String[]{months[monthNum]}) + " " + dayNum);
    }
}