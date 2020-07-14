package com.java.lesson2;

import java.util.Scanner;

public class DayMonthYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите день:  ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц:  ");
        int month = scanner.nextInt();
        System.out.println("Введите год:  ");
        int year = scanner.nextInt();
        date(day, month, year);
    }

    private static void date(int day, int month, int year) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) &&
                (day <= 30)) {
            day = day + 1;
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) &&
                (day == 31)) {
            month = month + 1;
            day = 1;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) &&
                (day == 30)) {
            month = month + 1;
            day = 1;
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) &&
                (day <= 30)) {
            day = day + 1;
        } else if ((month == 2) && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) && day == 29) {
            day = 1;
            month = month + 1;
        } else if ((month == 2) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) &&
                day == 28) {
            day = day + 1;
        } else if ((day == 31) && (month == 12)) {
            day = 1;
            month = 1;
            year = year + 1;
        } else day++;
        System.out.println("дата следующего дня: " + year + ":" + month + ":" + day);
    }


}

