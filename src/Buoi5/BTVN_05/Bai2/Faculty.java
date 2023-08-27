package Buoi5.BTVN_05.Bai2;

import java.util.Scanner;
import Buoi5.BTVN_05.Bai2.School;

class Faculty {
    static Scanner scanner = new Scanner(System.in);
    private String name;
    private String date;
    private School x = new School();

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Faculty.scanner = scanner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Faculty() {
    }

    public Faculty(String name, String date, School x) {
        this.name = name;
        this.date = date;
        this.x = x;
    }

    public void input() {
        System.out.print("Nhập tên trường: ");
        x.setName(scanner.nextLine());
        System.out.print("Nhập ngày vào trường: ");
        x.setDate(scanner.nextLine());
        System.out.print("Nhập tên khoa: ");
        name = scanner.nextLine();
        System.out.print("Nhập ngày vào khoa: ");
        date = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%15s%20s%15s%20s", x.getName(), x.getDate(), name, date);
    }
}
