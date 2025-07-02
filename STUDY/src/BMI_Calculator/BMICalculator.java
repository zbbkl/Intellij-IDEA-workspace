package BMI_Calculator;
import java.util.Scanner;
public class BMICalculator {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入您的身高（米）：");
        double height=scanner.nextDouble();
        System.out.println("请输入您的体重（kg）：");
        double weight=scanner.nextDouble();
        double bmi=weight/(height*height);
        System.out.printf("您的BMI是：%.2f\n",bmi);
        if(bmi<18.5) {
            System.out.println("您的体重过轻");
        }else if(bmi<24) {
            System.out.println("您的体重正常");
        }else if(bmi<28) {
            System.out.println("您的体重过重");
        }else if(bmi>28) {
            System.out.println("您的体重肥胖");
        }
        scanner.close();
    }
}
