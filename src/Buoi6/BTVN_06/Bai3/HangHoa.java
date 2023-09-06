package Buoi6.BTVN_06.Bai3;

import Buoi6.BTVN_06.Bai3.VatLieu;

import java.util.Scanner;

public class HangHoa {
    static Scanner scanner = new Scanner(System.in);
    protected String maHang;
    protected String tenHang;
    protected float soLuong;



    protected float donGia;
    int n;
    protected VatLieu[] dsVL ;

    public HangHoa() {
    }

    public HangHoa(String maHang, String tenHang, float soLuong, float donGia, int n, VatLieu[] dsVL) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.n = n;
        this.dsVL = dsVL;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }
    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public VatLieu[] getDsVL() {
        return dsVL;
    }

    public void setDsVL(VatLieu[] dsVL) {
        this.dsVL = dsVL;
    }

    public void nhap()
    {
        System.out.print("Nhập mã hàng: ");
        maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhập số lượng hàng: ");
        soLuong = scanner.nextFloat();
        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextFloat();
        do{
            System.out.println("Nhập số lượng vật liệu của sản phẩm n > 0: ");
            n= scanner.nextInt();
        }while(n < 1);
        dsVL = new VatLieu[n];
        for (int i = 0; i < n; i++)  dsVL[i] = new VatLieu();
        for (int i = 0; i < n; i++) {
            System.out.println(">>> NHẬP THÔNG TIN VẬT LIỆU THỨ " + (i+1) + "<<<");
            dsVL[i].nhap();
        }
    }

    public float tongTien() {
        return (this.soLuong * this.donGia);
    }

    public void outputListVatLieu()
    {
        System.out.printf("\n%15s%15s%15s", "Tên VL", "Màu sắc", "Độ cứng");
        for (int i = 0; i < n; i++) {
            dsVL[i].xuat();
        }
    }

    public void xuat()
    {
        System.out.printf("%2s%15s%15s%15s%20s%15s", maHang, tenHang, soLuong, donGia);
    }
}
