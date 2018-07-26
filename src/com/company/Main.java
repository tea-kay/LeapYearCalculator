package com.company;

public class Main {

    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        isLeapYear(1924);
    }

    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) {
            System.out.println("false");
            return false;
        } else {
            if((year % 4 == 0) && (year % 100 > 0)){
                System.out.println("true");
                return true;
            } else if (year % 400 == 0){
                System.out.println("true");
                return true;
            } else {
                System.out.println("false");
                return false;
            }
        }
    }
}
