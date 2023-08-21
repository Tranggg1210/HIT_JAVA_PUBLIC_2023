package Buoi3.BTVN03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    static Scanner scanner = new Scanner(System.in);
    static int[] input()
    {
        int n;
        do{
            System.out.println("Nhập số lượng phần tử của mảng n > 0: ");
            n = scanner.nextInt();
        }while (n <= 0);
        int[]arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhập arr[" + i +"]: ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }
        return arr;
    }


    static void output(int[] arr) {
        for (int value: arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = input();
        System.out.println("Các phần tử mảng vừa nhập là: ");
        output(a);
        Arrays.sort(a);
        System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
        output(a);
    }
}
