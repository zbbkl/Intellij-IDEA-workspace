package Simple_Encryptor;
import java.util.Scanner;

public class SimpleEncryptor {
    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c + 5 > 127) {
                c = (char) (c + 5 - 128 + 32);
            } else {
                c = (char) (c + 5);
            }
            encrypted.append(c);
        }

        return encrypted.toString();
    }

    public static String decrypt(String input) {

        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c - 5 < 32) {
                c = (char) (c - 5 + 128 - 32);
            } else {
                c = (char) (c - 5);
            }
            decrypted.append(c);
        }

        return decrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("简单字符串加密与解密程序");
        System.out.println("1. 加密");
        System.out.println("2. 解密");
        System.out.print("请选择操作(1/2): ");

        int choice;
        try {
            choice = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("输入无效，请输入1或2");
            return;
        }

        if (choice != 1 && choice != 2) {
            System.out.println("无效的选择，请输入1或2");
            return; // 结束程序
        }

        System.out.print("请输入字符串: ");
        String input = scanner.nextLine();

        if (input == null || input.isEmpty()) {
            System.out.println("输入不能为空");
            return;
        }

        if (choice == 1) {
            String encrypted = encrypt(input);
            System.out.println("加密结果: " + encrypted);
        } else {
            String decrypted = decrypt(input);
            System.out.println("解密结果: " + decrypted);
        }
    }
}
