package Buoi2.BTVN02;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh hình vuông: ");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++)
        {
            if(i == 1 || i == n)
            {
                for(int j = 1; j <= n; j++)
                    System.out.print("*");
            }else{
                for(int k = 1; k <= n; k++)
                {
                    if(k == 1 || k == n)  System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
