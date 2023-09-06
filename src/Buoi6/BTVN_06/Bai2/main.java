package Buoi6.BTVN_06.Bai2;

import Buoi6.BTVN_06.Bai2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Student> input() {
        int n;
        do {
            System.out.print("Nhâp số lượng sinh viên trong danh sách n > 0: ");
            n = scanner.nextInt();
        } while (n < 1);
        ArrayList<Student> listStudents = new ArrayList<Student>();
        Student s = new Student();
        for (int i = 0; i < n; i++) {
            System.out.println("==== NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1) + " ====");
            s.input();
            listStudents.add(s);
        }
        return listStudents;
    }

    public static void output(ArrayList<Student> s)
    {
        System.out.println("\n==== THÔNG TIN CỦA DANH SÁCH SINH VIÊN ====");
        System.out.printf("\n%1s%15s%15s%15s%15s%15s%15s", "ID", "Tên SV", "Tuổi", "Địa chỉ", "Ngày Sinh", "Lớp", "Trường");
        for (int i = 0; i < s.size(); i++) {
            s.get(i).output();
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> listStudent = input();
        output(listStudent);
    }
}
