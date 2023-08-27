package Buoi5.BTVN_05.Bai1;

import java.util.Scanner;

import Buoi5.BTVN_05.Bai1.NSX;

class Hang {
    static Scanner scanner = new Scanner(System.in);
    private String Mahang;
    private String TenHang;
    private NSX x = new NSX();

    public Hang() {
    }

    public Hang(String mahang, String tenHang, NSX x) {
        Mahang = mahang;
        TenHang = tenHang;
        this.x = x;
    }

    public void nhap() {
        System.out.println("============== NHẬP THÔNG TIN CỦA HÀNG ==============");
        System.out.print("Nhập mã hàng: ");
        Mahang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        TenHang = scanner.nextLine();
        x.Nhap();
    }

    public void xuat() {
        System.out.println("============== THÔNG TIN CỦA HÀNG ==============");
        System.out.println("Mã hàng: " + Mahang);
        System.out.println("Tên hàng: " + TenHang);
        x.Xuat();
    }

    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String mahang) {
        Mahang = mahang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }
}
