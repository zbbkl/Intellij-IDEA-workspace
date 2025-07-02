package Temperature_conversion;
import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入摄氏度（°）：");
        while (!scanner.hasNextDouble()) {
            System.out.println("错误：请输入有效的数字！");
            System.out.print("请重新输入摄氏度：");
            scanner.next();
        }
        double Celsius=scanner.nextDouble();
        double Fahrenheit=Celsius*1.8+32;
        System.out.printf("华氏度为（℉）：%.1f\n",Fahrenheit);
        scanner.close();
    }
}