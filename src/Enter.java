import java.util.Scanner;

public class Enter {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = scan.nextLine();
        System.out.println(s);
    }
}