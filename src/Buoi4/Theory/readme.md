# Buổi 4

## Giới thiệu OOP trong Java

- Lập trình hướng đối tượng (OOP) là phương pháp lập trình cho phép tạo ra các đối tượng (objects) thông qua các lớp (class)
  giúp code dễ phát triển và bảo trì trong tương lai, tập trung vào các thực thể giống như trong thực tế hơn.
  VD: nhà cửa, xe cộ, …

- Đối tượng (Object): bao gồm 2 thông tin: thuộc tính và phương thức.

* Thuộc tính (attribute): là các biến được sử dụng để lưu trữ những thông tin, đặc điểm của đối tượng. Họ tên, tuổi, địa chỉ, …
* Phương thức (method): chính là các hàm được sử dụng để thực hiện các hành động của đối tượng đó. Ăn, ngủ, đi chơi, …

- Lớp (Class): là nơi định nghĩa các thông tin trên của đối tượng, có thể hiểu như là kiểu dữ liệu do chúng ta tự định nghĩa

![alt text](https://4.bp.blogspot.com/-YDN3HuXGY1g/WUpxo02n6iI/AAAAAAAAAE0/-5hQn9VZVL4s9bYhyyobfcFZKWxxIIEzACLcBGAs/s1600/cars.jpg)

```java
    class Car {
        // Các thuộc tính (attributes)
        String name;
        int year;
        String description;

        // Các phương thức (methods)
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Year: " + year);
            System.out.println("Description: " + description);
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Car car = new Car();
        }
    }
```

## Package

- Hiểu đơn giản là package (gói) trong java là 1 folder chứa code, chứa các Class tương tự nhau

![alt text](https://xuanthulab.net/photo/package-4223.jpg)

```java
    package sample;

    public class Vehicle {
        //Code here

    }
```

## Phạm vi truy cập

![alt text](https://images.viblo.asia/82aaeb1f-5154-4dc5-9cf1-91b9b3fd8e9b.png)

```java
    public class Student {
        // Thuộc tính của đối tượng nên để phạm vi private
        private String name;
        private int age;

        // Phương thức của đối tượng nên để phạm vi public
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
```

## Constructor

- Hay còn được gọi là hàm tạo, sử dụng để khởi tạo 1 đối tượng của lớp đó thông qua từ khóa 'new' với các thuộc tính mà người dùng khai báo

```java
    public class Student {

        public Student() {

        }
    }
```

- Lưu ý:

* Hàm tạo phải có tên trùng tên class và để phạm vi truy cập public
* Hàm tạo sẽ được tự động gọi đến khi khởi tạo đối tượng qua từ khóa 'new'
* Có thể có nhiều hàm tạo
* Nếu không có hàm tạo thì chương trình sẽ tự động tạo ra hàm tạo không tham số

```java
    public class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name2, int age2) {
            name = name2;
            age = age2;
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Nguyen Kien", 17);
        }
    }
```

## Getters, setters

- Được sử dụng để thao tác với các thuộc tính của đối tượng 1 cách gián tiếp, đảm bảo tính đóng gói của đối tượng

```java
    public class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name2, int age2) {
            name = name2;
            age = age2;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public void setName(String name2) {
            name = name2;
        }

        public void setAge(int age2) {
            age = age2;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Nguyen Kien", 17);

            s1.setName("Nguyen Van A");
            s1.setAge(10);

            s1.display();

            System.out.println("Name: " + s2.getName());
            System.out.println("Age: " + s2.getAge());
        }
    }
```

## Bài tập và cách phân tích 1 sơ đồ lớp

- Bài 1: Thiết kế lớp Circle có thông tin sau:

![alt text](https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/class10-1.png)

- Bài 2: Thiết kế lớp Student có thông tin sau:

![alt text](https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/java-oop-23.png)

- Bài 3: Thiết kế lớp Point có thông tin sau:

![alt text](https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/encapsulation8.png)
