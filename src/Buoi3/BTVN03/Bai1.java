package Buoi3.BTVN03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {
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
        System.out.println("Các phần tử mảng vừa nhập là: ");
        for (int value: arr) {
            System.out.print(value + "\t");
        }
        System.out.println();
    }

    static void countElementInArray(int[] arr)
    {
        Arrays.sort(arr);
        int count = 1;
        for(int i = 0; i < arr.length; i++)
        {

            if(i == arr.length  - 1)
            {
                System.out.println("Số " + arr[i] + " xuất hiện "+ count + " lần");
            }else{
                if(arr[i] == arr[i+1]) count++;
                else{
                    System.out.println("Số " + arr[i] + " xuất hiện "+ count + " lần");
                    count = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr = input();
        output(arr);
        countElementInArray(arr);
    }
}
