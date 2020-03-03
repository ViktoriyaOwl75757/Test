import java.util.Scanner;
public class Konvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число:");
        String S = sc.nextLine();
        int X = Integer.parseInt(S);
        double Y = X;
        System.out.println(S +" " + X + " " + Y);
    }
}