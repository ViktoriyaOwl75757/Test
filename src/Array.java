import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте длину массива");
        int size = in.nextInt();
        int mus [] = new int [size];
        System.out.print("Введите элементы массива через пробел");
        for (int i=0; i < size; i++)
        {
            mus[i]=in.nextInt();
            mus[i] = mus[i]*2;
            System.out.println("Массив "+ mus[i]);
        }
    }
}
