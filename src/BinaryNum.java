import java.util.Scanner;

public class BinaryNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String bin = sc.nextLine();
        int n = 0;
        for (int i = 0; i < bin.length(); i++) {
            n <<= 1;
            if (bin.charAt(i) == '1') n++;
        }
        System.out.println("\"Число в десятичной системе = " + n);
    }
}
