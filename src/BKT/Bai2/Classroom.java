package BKT.Bai2;

import BKT.Bai2.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {

    static Scanner scanner = new Scanner(System.in);
    private int classID;
    private int numberOfStudent;
    private ArrayList<Student> listStudents = new ArrayList<Student>();

    public Classroom() {
    }

    public Classroom(int classID, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classID = classID;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input() {
        System.out.print("Nhập id của lớp: ");
        classID = scanner.nextInt();
        do {
            System.out.print("Nhập số lượng sinh viên của lớp n > 0: ");
            numberOfStudent = scanner.nextInt();
        } while (numberOfStudent < 1);
        scanner.nextLine();
        Student s = new Student();
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("==== NHẬP THÔNG TIN SINH VIÊN THỨ " + (i + 1) + " ====");
            s.input();
            listStudents.add(s);
        }
    }

    public void output() {
        System.out.println("\n====== THÔNG TIN CỦA LỚP CÓ ID LÀ" + classID + " VÀ GỒM " + numberOfStudent + " THÀNH VIÊN ======");
        System.out.printf("%1s%15s%15s%15s%15s%15s", "ID", "TÊN SV", "TUỔI", "GIỚI TÍNH", "ĐỊA CHỈ", "GPA");
        for (int i = 0; i < numberOfStudent; i++) {
            listStudents.get(i).output();
        }
    }

    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> matchingStudents = new ArrayList<>();
        for (int i = 0; i < numberOfStudent; i++) {
            if (listStudents.get(i).getName().contains(name)) {
                matchingStudents.add(listStudents.get(i));
            }
        }
        return matchingStudents;
    }
}
