package Student_Management_System;
import java.io.*;
import java.util.*;

// 学生类，实现了Serializable接口使其可序列化
class Student implements Serializable {
    // 序列化版本ID，用于版本控制
    private static final long serialVersionUID = 1L;

    private int id;         // 学生ID
    private String name;    // 学生姓名
    private int age;        // 学生年龄
    private String major;   // 学生专业

    // 构造方法
    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Getter和Setter方法
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", major=" + major + "]";
    }
}