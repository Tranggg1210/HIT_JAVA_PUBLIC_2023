package Buoi6.BTVN_06.Bai1;

import java.util.Scanner;

public class Dog extends Animal {
    static Scanner scanner = new Scanner(System.in);
    private String character;

    public Dog() {
    }

    public Dog(String name, Byte age, float weight, String character) {
        super(name, age, weight);
        this.character = character;
    }

    @Override
    public void input() {
        System.out.println("====== NHẬP THÔNG TIN BÉ CÚN ======");
        super.input();
        System.out.print("Nhập tính cách: ");
        character = scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.println("====== THÔNG TIN CỦA BÉ CÚN ======");
        super.output();
        System.out.println("Tính cách: " + character);
    }

    @Override
    public void tiengKeu() {
        super.tiengKeu();
        System.out.println("gâu gâu gâu...");
    }
}
