package Buoi5.Theory;

import java.util.Scanner;

class SV {

    static Scanner scanner = new Scanner(System.in);
    private String masv;
    private String hoten;

    private int age;

    public SV() {}
    public SV(String masv, String hoten, int age) {
        this.masv = masv;
        this.hoten = hoten;
        this.age = age;
    }

    public void input()
    {
        System.out.print("Nhập mã sinh viên: ");
        masv = scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        hoten = scanner.nextLine();
        System.out.print("Nhập tuổi của sinh viên: ");
        age = scanner.nextInt();
        scanner.nextLine();
    }

    public void output()
    {
        System.out.printf("\n%12s%30s%10s", masv, hoten, age);
    }
}
public class File2 {

    static Scanner scanner = new Scanner(System.in);

    static int n;
    static SV[] input()
    {

        do{
            System.out.print("Nhập số lượng sinh viên > 0: ");
            n = scanner.nextInt();
        }while(n <= 0);
        SV[] sv1 = new SV[n];

        for (int i = 0; i < n; i++) {
            sv1[i] = new SV();
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("==== NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1) + " ====");
            sv1[i].input();
        }

        return sv1;
    }


    static void output(SV[] sv1)
    {
        System.out.printf("\n%50s", "================== MẢNG THÔNG TIN SINH VIÊN ==================");
        System.out.printf("\n%10s%30s%10s", "Mã sinh viên", "Họ tên", "Tuổi");
        for (int i = 0; i < n; i++) {
            sv1[i].output();
        }
    }
    public static void main(String[] args) {
        SV[] sv1 = input();
        output(sv1);
    }
}
