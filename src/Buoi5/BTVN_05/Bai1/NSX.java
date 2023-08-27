package Buoi5.BTVN_05.Bai1;

import java.util.Scanner;

class NSX {
    static Scanner scanner = new Scanner(System.in);
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;

    public NSX() {
    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DcNSX = dcNSX;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        NSX.scanner = scanner;
    }

    public String getMaNSX() {
        return MaNSX;
    }

    public void setMaNSX(String maNSX) {
        MaNSX = maNSX;
    }

    public String getTenNSX() {
        return TenNSX;
    }

    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }

    public String getDcNSX() {
        return DcNSX;
    }

    public void setDcNSX(String dcNSX) {
        DcNSX = dcNSX;
    }

    public void Nhap() {
        System.out.print("Nhập mã nhà sản xuất: ");
        MaNSX = scanner.nextLine();
        System.out.print("Nhập tên nhà sản xuất: ");
        TenNSX = scanner.nextLine();
        System.out.print("Nhập địa chỉ nhà sản xuất: ");
        DcNSX = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("Mã NSX: " + MaNSX);
        System.out.println("Tên NSX: " + TenNSX);
        System.out.println("Địa chỉ NSX: " + DcNSX);
    }
}
