package BKT.Bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Address {

    static Scanner scanner = new Scanner(System.in);
    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void input() {
        System.out.print("Nhập tên thành phố: ");
        city = scanner.nextLine();
        System.out.print("Nhập tên huyện: ");
        district = scanner.nextLine();
    }

    public void output() {
        System.out.printf("%15s", (city + " - " + district));
    }

}
