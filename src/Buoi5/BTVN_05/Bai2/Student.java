package Buoi5.BTVN_05.Bai2;

import Buoi5.BTVN_05.Bai2.Faculty;

import java.util.Scanner;

public class Student {

    static Scanner scanner = new Scanner(System.in);
    private String name;
    private String aClass;
    private double Score;
    private Faculty y = new Faculty();

    public Student() {}
    public Student(String name, String aClass, double score, Faculty y) {
        this.name = name;
        aClass = aClass;
        Score = score;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getaClass()
    {
        return aClass;
    }
    public void setClass(String aClass) {
        this.aClass = aClass;
    }

    public double getScore() {
        return Score;
    }

    public void setScore(double score) {
        Score = score;
    }

    public void input()
    {
        System.out.print("Nhập tên sinh viên: ");
        name = scanner.nextLine();
        System.out.print("Nhập lớp của sinh viên: ");
        aClass = scanner.nextLine();
        do{
            System.out.print("Nhập điểm của sinh viên: ");
            Score = scanner.nextDouble();
        }while(Score < 0 || Score > 10);
        scanner.nextLine();
        y.input();
    }

    public void output()
    {
        System.out.printf("%15s%15s%10s", name, aClass, Score);
        y.output();
    }
}
