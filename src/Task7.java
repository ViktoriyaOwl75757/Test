import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        final int x = 81;
        final int y = 7;
        final int z = 57;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число");
        int num = in.nextInt();
        if ( num == x | num == y | num == z) {
            System.out.println("Данное значение имеется в константах");
        }
            else System.out.println("Такой константы нет!");
        }
    }
