package File_Content_Counter;
import java.io.*;
import java.util.Scanner;

public class FileContentCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象用于接收用户输入

        System.out.println("=== 文本文件内容统计程序 ===");
        System.out.print("请输入要统计的文件路径（例如：C:\\\\test.txt 或 test.txt）：");
        String filePath = scanner.nextLine(); // 读取用户输入的文件路径

        // 检查用户是否输入了文件路径
        if (filePath == null || filePath.trim().isEmpty()) {
            System.out.println("错误：文件路径不能为空！");
            scanner.close(); // 关闭Scanner
            return; // 结束程序
        }

        try {
            // 创建BufferedReader读取文件
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            int lineCount = 0;    // 行数统计
            int wordCount = 0;    // 单词数统计
            int charCount = 0;    // 字符数统计

            String line;
            // 逐行读取文件内容
            while ((line = reader.readLine()) != null) {
                lineCount++; // 每读到一行，行数加1
                charCount += line.length(); // 统计当前行的字符数（包括空格）

                // 统计当前行的单词数（忽略空行）
                if (!line.trim().isEmpty()) {
                    String[] words = line.split("\\s+"); // 按一个或多个空白字符分割
                    wordCount += words.length;
                }
            }

            reader.close(); // 关闭读取器

            // 输出统计结果
            System.out.println("\n=== 文件统计结果 ===");
            System.out.println("行数: " + lineCount);
            System.out.println("单词数: " + wordCount);
            System.out.println("字符数: " + charCount);

        } catch (IOException e) {
            System.out.println("错误：无法读取文件，请检查路径是否正确！");
            System.out.println("详细信息: " + e.getMessage());
        } finally {
            scanner.close(); // 确保Scanner被关闭
        }
    }
}
