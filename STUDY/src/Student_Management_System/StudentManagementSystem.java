package Student_Management_System;

import java.io.*;
import java.util.*;

public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager = new StudentManagerImpl();

        // 添加学生
        manager.addStudent(new Student(1, "张三", 20, "计算机科学"));
        manager.addStudent(new Student(2, "李四", 21, "软件工程"));
        manager.addStudent(new Student(3, "王五", 19, "计算机科学"));

        // 显示所有学生
        System.out.println("\n所有学生信息:");
        manager.getAllStudents().forEach(System.out::println);

        // 按专业筛选学生
        System.out.println("\n计算机科学专业的学生:");
        manager.getStudentsByMajor("计算机科学").forEach(System.out::println);

        // 查找学生
        System.out.println("\n查找ID为2的学生:");
        Student student = manager.findStudentById(2);
        System.out.println(student != null ? student : "学生ID不存在");

        // 修改学生信息
        System.out.println("\n修改ID为2的学生信息:");
        student.setName("李四新");
        student.setAge(22);
        try {
            manager.updateStudent(student);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // 显示修改后的学生信息
        System.out.println("\n修改后的学生信息:");
        System.out.println(manager.findStudentById(2));

        // 删除学生
        System.out.println("\n删除ID为3的学生:");
        manager.removeStudent(3);

        // 显示所有学生
        System.out.println("\n删除后的所有学生信息:");
        manager.getAllStudents().forEach(System.out::println);

        // 保存到文件
        System.out.println("\n保存学生信息到文件:");
        manager.saveToFile("students.dat");

        // 清空学生数据
        System.out.println("\n清空学生数据:");
        new ArrayList<>(manager.getAllStudents()).forEach(s -> manager.removeStudent(s.getId()));

        // 显示所有学生
        System.out.println("\n清空后的所有学生信息:");
        if (manager.getAllStudents().isEmpty()) {
            System.out.println("没有学生记录");
        }

        // 从文件加载
        System.out.println("\n从文件加载学生信息:");
        manager.loadFromFile("students.dat");

        // 显示所有学生
        System.out.println("\n加载后的所有学生信息:");
        manager.getAllStudents().forEach(System.out::println);
    }
}