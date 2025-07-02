package Grading_of_grades;
import java.util.Scanner;
public class GradingOfGrades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入学生考试成绩（0-100）：");
        while (!scanner.hasNextDouble()) {
            System.out.println("错误：请输入有效的数字！");
            System.out.print("请重新输入学生考试成绩（0-100分）：");
            scanner.next(); 
        }
        double grades=scanner.nextDouble();
            if (grades >= 0 && grades <= 100) {
                if (grades >= 90) {
                    System.out.println("成绩为A");
                } else if (grades >= 80) {
                    System.out.println("成绩为B");
                } else if (grades >= 70) {
                    System.out.println("成绩为C");
                } else if (grades >= 60) {
                    System.out.println("成绩为D");
                } else System.out.println("成绩为E");
            } else System.out.println("成绩不合法");
        scanner.close();
    }
}