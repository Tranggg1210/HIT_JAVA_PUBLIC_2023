package BTVN02;

import java.util.Scanner;

public class Bai4 {
    public static void output(float a, float b, float c)
    {
        if(b < 0)
        {
           if(c < 0)  System.out.println("=> Phương trình " + a + "x^4 - " + (-b) + "x^2  - " + (-c) + " = 0 có các nghiệm là: ");
           else if(c > 0)  System.out.println("=> Phương trình " + a + "x^4 - " + (-b) + "x^2  + " + c + " = 0 có các nghiệm là:");
        }else{
            if(c < 0)  System.out.println("=> Phương trình " + a + "x^4 + " + b + "x^2  - " + (-c) + " = 0 có các nghiệm là: ");
            else if(c > 0)  System.out.println("=> Phương trình " + a + "x^4 + " + b + "x^2  + " + c + " = 0 có các nghiệm là:");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a,b,c;
        System.out.println("Nhập ba số thực a,b,c của phương trình bậc 4: ");
        do{
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
        }while (a == 0 || b == 0 || c == 0);
        float denta = (b*b) - 4*a*c;
        if(denta < 0) System.out.println("Phương trình vô nghiệm");
        else if(denta == 0)
        {
            float x1 = (-b)/(2*a);
            if(x1 < 0) System.out.println("Phương trình vô nghiệm");
            else {

                System.out.println("x1 = " + Math.sqrt(x1));
                System.out.println("x2 = -" + Math.sqrt(x1));
            }
        } else{
            double x3, x4;
            x3 = (-b + Math.sqrt(denta))/(2*a);
            x4 = (-b - Math.sqrt(denta))/(2*a);
            if(x3 < 0)
            {
                if(x4 < 0) System.out.println("Phương trình vô nghiệm");
                else{
                    output(a,b,c);
                    System.out.println("x1 = " + Math.sqrt(x4));
                    System.out.println("x2 = -" + Math.sqrt(x4));
                }
            }else{
                if(x4 < 0){
                    output(a,b,c);
                    System.out.println("x1 = " + Math.sqrt(x3));
                    System.out.println("x2 = -" + Math.sqrt(x3));
                }
                else{
                    output(a,b,c);
                    System.out.println("x1 = " + Math.sqrt(x3));
                    System.out.println("x2 = -" + Math.sqrt(x3));
                    System.out.println("x3 = " + Math.sqrt(x4));
                    System.out.println("x4 = -" + Math.sqrt(x4));
                }
            }
        }
    }
}
