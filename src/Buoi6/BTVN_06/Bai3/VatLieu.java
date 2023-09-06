package Buoi6.BTVN_06.Bai3;

import java.util.Scanner;

public class VatLieu {

    static Scanner scanner = new Scanner(System.in);
    private String ten;
    private String mauSac;
    private int doCung;

    public VatLieu() {}
    public VatLieu(String ten, String mauSac, int doCung) {
        this.ten = ten;
        this.mauSac = mauSac;
        this.doCung = doCung;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getDoCung() {
        return doCung;
    }

    public void setDoCung(int doCung) {
        this.doCung = doCung;
    }

    public void nhap()
    {
        System.out.print("Nhập tên vật liệu: ");
        ten = scanner.nextLine();
        System.out.print("Nhập màu sắc của vật liệu: ");
        mauSac = scanner.nextLine();
        System.out.print("Nhập độ cứng của vật liệu: ");
        doCung = scanner.nextInt();
    }

    public void xuat()
    {
        System.out.printf("\n%15s%15s%15s", ten, mauSac, doCung);
    }
}
