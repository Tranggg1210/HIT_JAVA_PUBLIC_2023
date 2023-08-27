package Buoi5.BTVN_05.Bai2;

import java.util.Scanner;

import Buoi5.BTVN_05.Bai2.Student;

public class Bai2 {

    static Scanner scanner = new Scanner(System.in);

    static Student[] nhap() {
        int n;
        do {
            System.out.print("Nhập số lượng sinh viên > 0: ");
            n = scanner.nextInt();
        } while (n <= 0);
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("==== NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1) + " ====");
            s[i].input();
        }
        return s;
    }


    static void xuat(Student[] s) {
        System.out.println("\nTHÔNG TIN DANH SÁCH SINH VIÊN LÀ: ");
        System.out.printf("\n%1s%15s%15s%10s%15s%20s%15s%20s", "ID", "Họ tên", "Lớp", "Điểm", "Trường", "Ngày vào trường", "Khoa", "Ngày vào khoa");
        for (int i = 0; i < s.length; i++) {
            System.out.printf("\n%2s", (i + 1));
            s[i].output();
        }
    }

    public static void main(String[] args) {
        Student[] s = nhap();
        xuat(s);
    }
}

