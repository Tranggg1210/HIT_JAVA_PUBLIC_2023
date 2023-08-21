package Buoi3.BTVN03;

import java.util.Locale;
import java.util.Scanner;

public class Bai5 {

    static Scanner scanner = new Scanner(System.in);

    static void fomatName(String str)
    {
        String strFormatName = str.trim().toLowerCase().replaceAll("\\s+"," ");
        char[] arrString = strFormatName.toCharArray();
        for(int i = 0; i < arrString.length; i++)
        {
            if(i == 0) arrString[i] = Character.toUpperCase(arrString[i]);
            if(arrString[i] == 32)
            {
                arrString[i+1] = Character.toUpperCase(arrString[i+1]);
            }
        }
        strFormatName = String.valueOf(arrString);
        System.out.println("output: " + strFormatName);
    }

    public static void main(String[] args) {
        String str;
        do{
            System.out.println("Nhập chuỗi không rỗng: ");
            str = scanner.nextLine();
        }while(str.trim().equals(""));
        System.out.println("input: " + str);
       fomatName(str);
    }
}
