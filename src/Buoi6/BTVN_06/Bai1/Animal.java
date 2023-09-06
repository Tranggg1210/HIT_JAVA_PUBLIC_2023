package Buoi6.BTVN_06.Bai1;

import java.util.Scanner;

public class Animal {
    static Scanner scanner = new Scanner(System.in);
    protected String name;
    protected Byte age;
    protected float weight;

    public Animal() {
    }

    public Animal(String name, Byte age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void input()
    {
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextByte();
        System.out.print("Nhập cân nặng: ");
        weight =  scanner.nextFloat();
        scanner.nextLine();
    }
    public void output()
    {
        System.out.println("Tên con vật: " + name);
        System.out.println("Tuổi của con vât: " + age);
        System.out.println("Cân nặng của con vật: " + weight);
    }
    public void tiengKeu()
    {
        System.out.print("Tiếng kêu của con vật là: ");
    }
}
