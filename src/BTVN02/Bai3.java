package BTVN02;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhập số nguyên dương n: ");
            n = scanner.nextInt();
        }while (n <= 0);
        boolean isPrime = true;
        if(n < 2) isPrime = false;
        else{
                for(int i = 2; i <= Math.sqrt(n); i++)
                {
                    if(n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
        }
        if (isPrime) System.out.println( n + " là số nguyên tố");
        else System.out.println( n + " là không phải là số nguyên tố");
    }
}
