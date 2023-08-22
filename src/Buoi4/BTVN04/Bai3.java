package Buoi4.BTVN04;

import java.util.Scanner;

class SinhVien{

    static Scanner scanner = new Scanner(System.in);
    private String maSinhVien;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public SinhVien() {}

    public SinhVien(String maSinhVien, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void nhap()
    {
        System.out.print("Nhập mã sinh viên: ");
        maSinhVien = scanner.nextLine();
        System.out.print("Nhập họ tên sinh viên: ");
        hoTen = scanner.nextLine();
        do{
            System.out.print("Nhập điểm toán của sinh viên: ");
            diemToan = scanner.nextFloat();
            if(diemToan < 0 || diemToan > 10) System.out.println("Nhập sai!");
        }while(diemToan < 0 || diemToan > 10);
        do{
            System.out.print("Nhập điểm lý của sinh viên: ");
            diemLy = scanner.nextFloat();
            if(diemLy < 0 || diemLy > 10) System.out.println("Nhập sai!");
        }while(diemLy < 0 || diemLy > 10);
        do{
            System.out.print("Nhập điểm hóa của sinh viên: ");
            diemHoa = scanner.nextFloat();
            if(diemHoa < 0 || diemHoa > 10) System.out.println("Nhập sai!");
        }while(diemHoa < 0 || diemHoa > 10);
        scanner.nextLine();
    }

    public float diemTB()
    {
        return ((diemLy+diemToan+diemHoa)/3);
    }
    public void xuat(){
        System.out.printf("\n%20s%20s%20f%20f%20f%20f", maSinhVien, hoTen, diemToan, diemHoa, diemLy, diemTB());
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhập số lượng sinh viên >= 5: ");
            n = scanner.nextInt();
        }while(n < 5);

        SinhVien[] sv = new SinhVien[n];

        for(int i = 0; i < n; i++) sv[i] = new SinhVien();

        for(int i = 0; i < n; i++)
        {
            System.out.println("==== NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1) + " ====");
            sv[i].nhap();
        }

        System.out.printf("%85s","======= THÔNG TIN CỦA CÁC SINH VIÊN =======\n");
        System.out.printf("\n%20s%20s%20s%20s%20s%20s", "Ma Sinh Vien", "Ho Ten", "Diem Toan", "Diem Hoa", "Diem Ly", "Diem trung binh");
        for (int i = 0; i < n; i++) {
            sv[i].xuat();
        }
    }
}
//5
//123
//Nguyen Thi A
//10
//10
//10
//124
//Nguyen Van B
//10
//9
//8
//125
//Nguyen Thi C
//10
//8
//6
//Nguyen Van D
//6
//8
//9
//126
//Nguyen Thi E
//5
//6
//8



