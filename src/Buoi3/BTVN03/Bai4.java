package Buoi3.BTVN03;

import java.util.Scanner;

public class Bai4 {

    static boolean checkSymmetry(String str)
    {
        int n = str.length() - 1;
        for(int i = 0; i < (str.length()/2); i++)
        {
            if(str.charAt(i) != str.charAt(n))
                return false;
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        do{
            System.out.println("Nhập chuỗi không rỗng str: ");
            str = scanner.nextLine();
        }while (str.trim().equals(""));
        if(checkSymmetry(str)) System.out.println("true");
        else System.out.println("false");
    }
}
