package Buoi6.BTVN_06.Bai2;

import java.util.Scanner;

public class Date {
    static Scanner scanner = new Scanner(System.in);
    private int year;
    private byte month;
    private byte day;

    public Date() {
    }

    public Date(int year, byte month, byte day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static void setScanner(Scanner scanner) {
        Date.scanner = scanner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public void input() {
        System.out.print("Nhập ngày: ");
        day = scanner.nextByte();
        System.out.print("Nhập tháng: ");
        month = scanner.nextByte();
        System.out.print("Nhập năm: ");
        year = scanner.nextInt();
    }

    public void output() {
        System.out.printf("%15s", (day + "/" + month + "/" + year));
    }
}
