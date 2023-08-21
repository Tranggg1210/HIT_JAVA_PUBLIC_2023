package Buoi3.LYTHUYET;

import java.util.Scanner;

public class Theory {
    static Scanner scanner = new Scanner(System.in);

    public static int sum(int a[], int n)
    {
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        System.out.println("Chào buổi 3");
        int[] n = new int[5];
//        long[] a = new long[12];
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Nhập n[" + i + "]: ");
            n[i] = scanner.nextInt();
        }
        System.out.println("Các phần tử của mảng n là: ");
        for (int values:n) {
            System.out.print(values + "\t");
        }
        System.out.println("\nTổng các giá trị của mảng: " + sum(n,5));
//        Theory a = new Theory();
//        System.out.println("\nTổng các giá trị của mảng: " + a.sum(n,5));
//        System.out.println(Math.);
        String t = "   Nguyễn Thị Trang   ";
        System.out.println(t.trim());
    }
}
