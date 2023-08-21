package Buoi3.BTVN03;

import java.util.Scanner;

public class Bai2 {
   public static Scanner scanner = new Scanner(System.in);

    static void output(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void addNewElementToArray(int a[], int n)
    {
        int position, value;
        do{
            System.out.print("\nNhập vị trí cần thêm phần tử: ");
            position = scanner.nextInt();
        }while(position <= 0 || position > n);
        System.out.print("\nNhập giá trị phần tử mới: ");
        value = scanner.nextInt();
        position--;
        for (int i = n; i > position; i--) {
            a[i] = a[i - 1];
        }
        a[position] = value;
        n++;
        System.out.println("Mảng sau khi được thêm phần tử là: ");
        output(a,n);
        removeElementToArray(a,n);

    }

    static void removeElementToArray(int[] a, int n)
    {
        int positionRemove;
        do{
            System.out.print("\nNhập vị trí cần xóa phần tử: ");
            positionRemove = scanner.nextInt();
        }while(positionRemove < 0 || positionRemove > n);
        n--;
        for(int i = positionRemove ; i < n; i++)
        {
            a[i] = a[i+1];
        }
        System.out.println("Mảng sau khi xóa phần tử là: ");
        output(a,n);
    }


    public static void main(String[] args) {
        int n;
        do{
            System.out.println("Nhập số lượng phần tử của mảng n > 0: ");
            n = scanner.nextInt();
        }while (n <= 0);
        int[] a = new int[n+1];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Nhập arr[" + i +"]: ");
            a[i] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Các phần tử mảng vừa nhập là: ");
        output(a, n);
        addNewElementToArray(a,n);
    }
}

