package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Poletaev S.V.");
        student.setGroup("15-P");
        student.setStartDate(new Date());
        System.out.println(student.getFio() +
                System.lineSeparator() +
                student.getGroup() +
                System.lineSeparator() +
                student.getStartDate());
    }
}
