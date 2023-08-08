package Buoi2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Buoi2 {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập n: ");
//        int n = scanner.nextInt();
//        // sout = System.out.println("Hello world!");
//        System.out.println("Biến n = " + n);
//        int sum = 0;
//        for(int i = 0; i <= n; i++)
//        {
//            sum += i;
//        }
//        System.out.println("Tổng các số từ 1 đến " + n + " là: " + sum);
//        switch (n)
//        {
//            case 1:
//                System.out.println("Đây là số một"); break;
//            case 2:
//                System.out.println("Đây là số hai"); break;
//            case 3:
//                System.out.println("Đây là số ba"); break;
//            case 4:
//                System.out.println("Đây là số bốn"); break;
//            case 5:
//                System.out.println("Đây là số năm"); break;
//            case 6:
//                System.out.println("Đây là số sáu"); break;
//            case 7:
//                System.out.println("Đây là số bảy"); break;
//            case 8:
//                System.out.println("Đây là số tám"); break;
//            case 9:
//                System.out.println("Đây là số chín"); break;
//            default:
//                System.out.println("Đây là số lớn hơn 9 hoặc nhỏ hơn 1"); break;
//        }
//        System.out.println("Nhập f có kiểu float: ");
//        float f = scanner.nextFloat();
//        System.out.println("Nhập l có kiểu long: ");
//        long l = scanner.nextLong();
//        System.out.println("Nhập d có kiểu double: ");
//        double d = scanner.nextDouble();
//        System.out.println("Nhập c là một ký tự kiểu char: ");
//        char c = scanner.next().charAt(0);
//        System.out.println("Nhập s là một kiểu dữ liệu string: ");
//        scanner.nextLine();
//        String s = scanner.nextLine();
//        System.out.println("Nhập b có kiếu boolean: ");
//        boolean b = scanner.nextBoolean();
//        System.out.println("Đây là kiểu float: " + f);
//        System.out.println("Đây là kiểu long: " + l);
//        System.out.println("Đây là kiểu double" + d);
//        System.out.println("Đây là kiểu char: " + c);
//        System.out.println("Đây là kiểu string: " + s);
//        System.out.println("Đây là kiểu boolean: " + b);
//        if (sum % 2 == 0)
//        {
//            System.out.println("Sum là giá trị chẵn");
//        }
//        else{
//            System.out.println("Sum là giá trị lẻ");
//        }
        System.out.println("Nhập m,n: ");
        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        if ((m + n) % 3 == 0) {
            System.out.println("Tổng hai số " + m + " và " + n + " có chia hết cho 3");
        } else System.out.println("Tổng hai số " + m + " và " + n + " không chia hết cho 3");
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Giá trị của biến sum: " + sum);
        int j = 10;
        while (j > 1) {
            System.out.println("Biến j có giá trị là: " + j);
            j--;
        }
//        int h = 5
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) sum1 += i;
        }

        System.out.println("Tổng các số chia hết cho 15 từ 1 đến 100 tính theo for là: " + sum1);
        int sum2 = 0;
        int g = 1;
        while (g <= 100) {
            if (g % 15 == 0) sum2 += g;
            g++;
        }
        System.out.println("Tổng các số chia hết cho 15 từ 1 đến 100 tính theo while là: " + sum2);

    }
}


