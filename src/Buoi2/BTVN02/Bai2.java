package Buoi2.BTVN02;

import java.util.Scanner;

public class Bai2 {
    public static long factorial(int n)
    {
        long numberFactorial = 1;
        for(int i = 1; i <= n; i++)
            numberFactorial *= i;
        return numberFactorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
//Câu a
        do{
            System.out.println("Nhập n: ");
            n = scanner.nextInt();
        }while (n <= 0);
        float S = 0;
        for(int i = 1; i <= n; i++)
            S += (1.0/i);
        System.out.println("Giá trị của biểu thức S là: " + S);
// Câu b
        long P = 0;
        for(int i = 1; i <= n; i++)
            P += factorial(i);
        System.out.println("Giá trị của biểu thức P là: " + P);
    }
}
