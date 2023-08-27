package Buoi2.BTVN02;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        do{
            System.out.println("Nhập a,b,c > 0: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }while (a <= 0 || b <= 0 || c <= 0);
        int count = 0;
        for(int i = 1; i <= a; i++)
        {
            if(2*i <= b && 4*i <= c) count++;
        }
        int sum = count + count*2 + count*4;
        System.out.println(
                "=> Tổng số quả tối đa: "
                + sum + " (Chanh: " + count + ", Táo: "
                + 2*count + ", Lê: " + 4*count +")" );
    }
}
