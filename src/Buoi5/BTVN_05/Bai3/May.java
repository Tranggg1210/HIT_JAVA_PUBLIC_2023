package Buoi5.BTVN_05.Bai3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class May {
    static Scanner scanner = new Scanner(System.in);
    private String MaMay;
    private String TenMay;
    private String TinhTrang;

    public May() {
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        MaMay = maMay;
        TenMay = tenMay;
        TinhTrang = tinhTrang;
    }

    public void nhap()
    {
        System.out.print("Nhập mã máy: ");
        MaMay = scanner.nextLine();
        System.out.print("Nhập tên máy: ");
        TenMay = scanner.nextLine();
        System.out.print("Nhập tình trạng: ");
        TinhTrang = scanner.nextLine();
    }

    public void xuat()
    {
        System.out.printf("%15s%15s%15s", MaMay, TenMay, TinhTrang);

    }
}
