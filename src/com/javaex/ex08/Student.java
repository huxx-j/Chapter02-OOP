package com.javaex.ex08;

public class Student extends Person{
    private String schoolName;

    public Student(){

    }
    public Student(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String name, int age, String schoolName) {
//        super(name, age);
        super(name, age);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }



    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("학교 : " + schoolName);
    }
}
