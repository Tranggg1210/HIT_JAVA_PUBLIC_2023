package Buoi6.BTVN_06.Bai2;

import java.util.Scanner;

public class Student extends Person {
    static Scanner scanner = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    private String id;
    private String studentClass;
    private String school;

    public Student() {
    }

    public Student(String name, byte age, String address, Date birthDay, String id, String studentClass, String school) {
        super(name, age, address, birthDay);
        this.id = id;
        this.studentClass = studentClass;
        this.school = school;
    }

    @Override
    public void input() {
        System.out.print("Nhập id: ");
        id = scanner.nextLine();
        super.input();
//        scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        studentClass = scanner.nextLine();
        System.out.print("Nhập tên trường: ");
        school = scanner.nextLine();
    }

    @Override
    public void output() {
        System.out.printf("\n%s", id);
        super.output();
        System.out.printf("%15s%15s", studentClass, school);
    }
}
