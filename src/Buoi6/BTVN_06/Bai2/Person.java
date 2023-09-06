package Buoi6.BTVN_06.Bai2;

import java.util.Scanner;
import Buoi6.BTVN_06.Bai2.Date;

public class Person {
    static Scanner scanner = new Scanner(System.in);
    protected String name;
    protected byte age;
    protected String address;
    protected Date birthDay = new Date();

    public Person(){}
    public Person(String name, byte age, String address, Date birthDay) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public void input()
    {
        System.out.print("Nhập tên: ");
        name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextByte();
        scanner.nextLine();
        System.out.print("Nhập địa chỉ: ");
        address = scanner.nextLine();
        System.out.print(">>>Nhập ngày tháng năm sinh<<<\n");
        birthDay.input();
    }

    public void output()
    {
        System.out.printf("%15s%15s%15s", name, age, address);
        birthDay.output();
    }
}
