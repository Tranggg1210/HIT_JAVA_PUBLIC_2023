package Buoi4.BTVN04;

import java.util.Scanner;

class HCN {
    static Scanner scanner = new Scanner(System.in);
    private float d;
    private float r;

    public void setD(float d) {
        this.d = d;
    }

    public void setR(float r) {
        this.r = r;
    }

    public  HCN() {}
    public HCN(float d, float r) {
        this.d = d;
        this.r = r;
    }

    public void nhap()
    {
        do{
            System.out.print("Nhập chiều dài của hcn: ");
            d = scanner.nextFloat();
        }while(d <= 0);

        do{
            System.out.print("Nhập chiều rộng của hcn: ");
            r = scanner.nextFloat();
        }while(r <= 0);
    }

    public void veHCN()
    {
        System.out.println("========== HÌNH VẼ BIỂU DIỄN HÌNH CHỮ NHẬT ==========");
        for(int i = 0; i < d; i++)
        {
            for(int j = 0; j < r; j++)
                if(i == 0 || i == d - 1 || j == 0 || j == r - 1)
                {
                    System.out.print(" * ");
                }else System.out.print("   ");
            System.out.println();
        }
    }

    public float dienTich() {
        return (d*r);
    }

    public float chiVi()
    {
        return ((d+r)/2);
    }

    public void xuat()
    {
        System.out.println("========== THÔNG TIN CỦA HÌNH CHỮ NHẬT ==========");
        System.out.println("Chiều dài: " + d);
        System.out.println("Chiều rộng: " + r);
        System.out.println("Chu vi: " + chiVi());
        System.out.println("Diện tích: " + dienTich());
    }
}

public class Bai2 {
    public static void main(String[] args) {
        HCN h1 = new HCN();
        h1.nhap();
        h1.xuat();
        h1.veHCN();
    }
}
