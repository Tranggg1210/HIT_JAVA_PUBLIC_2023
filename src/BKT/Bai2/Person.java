package BKT.Bai2;

import java.util.Scanner;

public class Person {
    static Scanner scanner = new Scanner(System.in);
    protected String name;
    protected int age;
    protected String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input()
    {
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        gender = scanner.nextLine();
    }

    public void output()
    {
        System.out.printf("%15s%15s%15s", name, age, gender);
    }
}
