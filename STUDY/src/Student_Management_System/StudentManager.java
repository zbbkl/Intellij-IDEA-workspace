package Student_Management_System;

import java.io.*;
import java.util.*;

interface StudentManager {
    void addStudent(Student student);              // 添加学生
    void removeStudent(int id);                   // 删除学生
    Student findStudentById(int id);              // 按ID查找学生
    List<Student> getAllStudents();               // 获取所有学生
    List<Student> getStudentsByMajor(String major); // 按专业查找学生
    void updateStudent(Student student);          // 更新学生信息
    void saveToFile(String fileName);             // 保存到文件
    void loadFromFile(String fileName);           // 从文件加载
}
