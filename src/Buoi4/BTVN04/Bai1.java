package Buoi4.BTVN04;

import java.util.Scanner;

class Book {
    static Scanner scanner = new Scanner(System.in);
    private String masach;
    private String tensach;
    private String tacgia;
    private String nxb;
    private int namsx;

    public Book() {
    }

    public Book(String masach, String tensach, String tacgia, String nxb, int namsx) {
        this.masach = masach;
        this.tacgia = tacgia;
        this.namsx = namsx;
        this.tensach = tensach;
        this.nxb = nxb;
    }

    public String getMasach() {
        return masach;
    }

    public void setMasach(String masach) {
        this.masach = masach;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public int getNamsx() {
        return namsx;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public void input() {
        System.out.print("Nhập mã sách: ");
        masach = scanner.nextLine();
        System.out.print("Nhập tên sách: ");
        tensach = scanner.nextLine();
        System.out.print("Nhập tác giả: ");
        tacgia = scanner.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nxb = scanner.nextLine();
        System.out.print("Nhập năm suất bản: ");
        namsx = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.printf("\n%20s%20s%20s%20s%20d", masach, tensach, tacgia, nxb, namsx);
    }

}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Book b1 = new Book();
        int n;
        do{
            System.out.println("Nhập số lượng sách >= 5: ");
            n = scanner.nextInt();
        }while(n < 5);
        Book[] b2 = new Book[n];
        for (int i = 0; i < n; i++) {
            b2[i] = new Book();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1) + ": ");
            b2[i].input();
        }

        System.out.printf("\n%80s","======= THÔNG TIN CỦA CÁC QUYỂN SÁCH =======\n");
        System.out.printf("\n%20s%20s%20s%20s%20s", "Ma sach", "Ten sach", "Tac gia", "Nha xuat ban", "Nam xuat ban");
        for(int i = 0; i < 5; i++)
        {
            b2[i].output();
        }
    }
}


//001
//OOP
//Nguyen Van A
//NXB KHTN
//2022
//002
//He quan tri CSDL
//Tran Thi B
//NXB KHTN
//2023
//003
//CSDL
//Dao Van C
//NXB KHTN
//2021
//004
//HQTCSDL
//Le Van D
//NXB KHTN
//2019
//005
//An ninh mang
//Nguyen Van E
//NXB KHTN
//2022
