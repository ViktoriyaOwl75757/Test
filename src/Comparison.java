import java.util.Scanner;
public class Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = sc.nextLine();
        int len1 = str1.length();
        System.out.print("Введите строку 2: ");
        String str2 = sc.nextLine();
        int len2 = str2.length();
        if (len1 > len2) {
            System.out.print("Длинная строка: " + str1);
        }
        if (len1 < len2) {
            System.out.print("Длинная строка: " + str2);
        } else {
            System.out.print("Длина строк равна");
        }
    }
}

