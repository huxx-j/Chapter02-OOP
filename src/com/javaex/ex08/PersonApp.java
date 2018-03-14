package com.javaex.ex08;

public class PersonApp {
    public static void main(String[] args) {

        Person p = new Person("정우성",45);
        p.showInfo();

        Student s01 = new Student("서울고등학교");
        Student s02 = new Student("이정재",25,"한국고등학교");
        s01.showInfo();
        s02.showInfo();

        Person p1 = new Student();
//        Person (Student)p2 = new Student();

        p1.showInfo();
    }
}
