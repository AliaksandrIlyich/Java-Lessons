package com.java.lesson2;

import java.util.Scanner;

public class DayMonthYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите день:  ");
        int day = scanner.nextInt();
        System.out.println("Введите месяц:  ");
        int month = scanner.nextInt();
        System.out.println("Введите год:  ");
        int year = scanner.nextInt();
        Date(day, month, year);
        System.out.println(day);
        System.out.println(month);
        System.out.println(year);
    }

    public static void Date(int year, int month, int day) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) &&
                (day <= 30)) {
            day = day + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) &&
                (day == 31)) {
            day = 1;
            month = month + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && day > 31) {
            System.out.println("Неправильно введена дата");
        } else if ((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) & day > 30) {
            System.out.println("Неправильно введена дата");
        } else if (month > 12 || month < 1) {
            System.out.println("Неправильно введена дата");
        } else if ((month == 4 || month == 6 || month == 9 || month == 11) &
                (day == 30)) {
            day = 1;
            month = month + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        } else if ((month == 2) && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) & day == 29) {
            day = 1;
            month = month + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        } else if ((month == 2) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) &
                day == 28) {
            day = day + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        } else if ((day == 31) && (month == 12)) {
            day = 1;
            month = 1;
            year = year + 1;
            System.out.println(day);
            System.out.println(month);
            System.out.println(year);
        }
    }
}



