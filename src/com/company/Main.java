package com.company;


public class Main {
    private int hour;
    private int minute;
    private int second;

    public static void main(String[] args) {
        String o = "hhgsad";

        System.out.println();
    }

    public static void useField() {
    }

    public static void useX() {
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second > 60) {
            throw new IllegalArgumentException("The input value is out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public void doTime() {
        try {
            setTime(99, 99, 99);

        } catch (IllegalArgumentException e ) {
            System.out.printf("%s", e.getMessage());
        }

        System.out.printf("%02d : %02d : %02d", hour, minute, second);
    }
}
