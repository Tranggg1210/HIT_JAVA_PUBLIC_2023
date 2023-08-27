package Buoi5.Theory;

public class File1 {

    public static final double PI = 3.14;

    public static int counter = 0;

    public static int add(int a, int b)
    {
        return a+b;
    }

    public int MathUtils(){
        return counter++;
    }
    public static void main(String[] args) {
        System.out.println("Giá trị của biến PI là: " + PI);
        System.out.println("Tổng hai số 6 và 9 là: " + add(6,9));
        System.out.println("Giá trị biến counter là: " + File1.counter);
    }
}
