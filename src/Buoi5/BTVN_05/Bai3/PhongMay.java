package Buoi5.BTVN_05.Bai3;

import Buoi5.BTVN_05.Bai3.QuanLy;
import Buoi5.BTVN_05.Bai3.May;

import java.util.Scanner;

public class PhongMay {

    static Scanner scanner = new Scanner(System.in);
    private String MaPhong;
    private String TenPhong;
    private double DienTich;
    private QuanLy x = new QuanLy();
    private May[] y;
    int n;

    public PhongMay(){}
    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, int n) {
        MaPhong = maPhong;
        TenPhong = tenPhong;
        DienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTenPhong() {
        return TenPhong;
    }

    public void setTenPhong(String tenPhong) {
        TenPhong = tenPhong;
    }

    public double getDienTich() {
        return DienTich;
    }

    public void setDienTich(double dienTich) {
        DienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void nhap(){
        System.out.println("============== NHẬP THÔNG TIN CỦA PHÒNG MÁY ==============");
        System.out.print("Nhập mã phòng: ");
        MaPhong = scanner.nextLine();
        System.out.print("Nhập tên phòng: ");
        TenPhong = scanner.nextLine();
        System.out.print("Nhập diện tích của phòng: ");
        DienTich = scanner.nextDouble();
        scanner.nextLine();
        x.nhap();
        do{
            System.out.print("Nhập số lượng máy n > 0: ");
            n = scanner.nextInt();
        }while(n < 1);
        scanner.nextLine();
        y = new May[n];
        for(int i = 0; i < n; i++)
        {
            y[i] = new May();
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println("==== NHẬP THÔNG TIN MÁY THỨ " + (i+1) + " ====");
            y[i].nhap();
        }
    }

    public void xuat()
    {
        System.out.println("\nTHÔNG TIN PHÒNG MÁY LÀ: ");
        System.out.printf("%1s%20s%20s", "Mã phòng: " + MaPhong, "Tên phòng: " + TenPhong, "Diện tích: " + DienTich);
        x.xuat();
        System.out.printf("\n%1s%15s%15s%15s", "ID", "Mã máy", "Tên máy", "Tình trạng");
        for (int i = 0; i < n; i++) {
            System.out.printf("\n%2s", (i+1) );
            y[i].xuat();
        }

    }
}
