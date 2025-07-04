package Student_Management_System;

import java.io.*;
import java.util.*;

class StudentManagerImpl implements StudentManager {
    private Map<Integer, Student> students;  // 使用Map存储学生，key为学生ID

    public StudentManagerImpl() {
        students = new HashMap<>();
    }

    @Override
    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new IllegalArgumentException("学生ID已存在: " + student.getId());
        }
        students.put(student.getId(), student);
        System.out.println("添加学生成功: " + student.getName());
    }

    @Override
    public void removeStudent(int id) {
        Student student = students.remove(id);
        if (student != null) {
            System.out.println("删除学生成功: " + student.getName());
        } else {
            System.out.println("学生ID不存在: " + id);
        }
    }

    @Override
    public Student findStudentById(int id) {
        return students.get(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    @Override
    public List<Student> getStudentsByMajor(String major) {
        List<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getMajor().equals(major)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public void updateStudent(Student student) {
        if (students.containsKey(student.getId())) {
            students.put(student.getId(), student);
            System.out.println("更新学生信息成功: " + student.getName());
        } else {
            throw new IllegalArgumentException("学生ID不存在: " + student.getId());
        }
    }

    // 序列化保存学生数据到文件
    @Override
    public void saveToFile(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("学生信息已保存到文件: " + fileName);
        } catch (IOException e) {
            System.err.println("保存文件失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 从文件反序列化加载学生数据
    @Override
    @SuppressWarnings("unchecked")
    public void loadFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("文件不存在: " + fileName);
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (Map<Integer, Student>) ois.readObject();
            System.out.println("已从文件加载学生信息: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("加载文件失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
}