package Buoi6.BTVN_06.Bai1;

import java.util.Scanner;

public class Cat extends Animal {
    static Scanner scanner = new Scanner(System.in);
    private String color;
    private String preferences;
    private String ownerName;

    public Cat() {
    }

    public Cat(String name, Byte age, float weight, String color, String preferences, String ownerName) {
        super(name, age, weight);
        this.color = color;
        this.preferences = preferences;
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void input() {
        System.out.println("====== NHẬP THÔNG TIN CỦA MÈO ======");
        super.input();
        System.out.print("Nhập màu sắc: ");
        color = scanner.nextLine();
        System.out.print("Nhập sở thích: ");
        preferences = scanner.nextLine();
        System.out.print("Nhập chủ sở hữu: ");
        ownerName = scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.println("====== THÔNG TIN CỦA BÉ MÈO LÀ ======");
        super.output();
        System.out.println("Màu sắc: " + color);
        System.out.println("Sở thích: " + preferences);
        System.out.println("Chủ sở hữu: " + ownerName);
    }

    @Override
    public void tiengKeu() {
        super.tiengKeu();
        System.out.println("meo meo meo...");
    }
}
