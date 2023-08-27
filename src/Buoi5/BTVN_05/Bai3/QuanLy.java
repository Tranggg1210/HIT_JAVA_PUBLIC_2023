package Buoi5.BTVN_05.Bai3;

import java.util.Scanner;

public class QuanLy {
    static Scanner scanner = new Scanner(System.in);
    private String MaQL;
    private String HoTen;

    public QuanLy(){}
    public QuanLy(String maQL, String hoTen) {
        MaQL = maQL;
        HoTen = hoTen;
    }

    public String getMaQL() {
        return MaQL;
    }

    public void setMaQL(String maQL) {
        MaQL = maQL;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public void nhap()
    {
        System.out.print("Nhập mã quản lý: ");
        MaQL = scanner.nextLine();
        System.out.print("Nhập họ tên quản lý: ");
        HoTen = scanner.nextLine();
    }
    public void xuat()
    {
        System.out.printf("\n%1s%15s", "Mã quản lý: " + MaQL, "Họ tên: " + HoTen);
    }
}
