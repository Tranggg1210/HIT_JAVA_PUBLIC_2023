package BKT.Bai2;

import BKT.Bai2.Address;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{
    static Scanner scanner = new Scanner(System.in);
    private int id;
    private Address address = new Address();
    private double gpa;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Student(){}

    public Student(String name, int age, String gender, int id, Address address, double gpa) {
        super(name, age, gender);
        this.id = id;
        this.address = address;
        this.gpa = gpa;
    }
    @Override
    public void input()
    {
        System.out.print("Nhập id: ");
        id = scanner.nextInt();
        super.input();
        address.input();
        System.out.print("Nhập 0 <= gpa <= 4: ");
        gpa = scanner.nextDouble();
    }

    @Override
    public void output()
    {
        System.out.printf("\n%2s", id);
        super.output();
        address.output();
        System.out.printf("%15s", gpa);
    }
}
