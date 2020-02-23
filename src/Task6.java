import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число");
        int x = in.nextInt();
        System.out.print("Введите второе число");
        int y = in.nextInt();
        System.out.print("Введите третье число");
        int z = in.nextInt();
        int [] mas = {x, y, z};
        int a = mas.length;
        double res = (double)(mas[0] + mas[1]+ mas[2])/a;
        System.out.println(res);
        int res1 = (int)res/2;
        if (res1 > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
