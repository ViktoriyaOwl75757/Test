import java.util.Scanner;
public class Sorting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Задайте длину массива");
        int size = scan.nextInt();
        int array [] = new int [size];
        System.out.print("Введите элементы массива через пробел");
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            System.out.println(array);
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
               if (array[j] > array[j + 1]) {
                  int tmp = array[j];
                  array[j] = array[j + 1];
                   array[j + 1] = tmp;
                   System.out.println(tmp);
                }
            }
      }
   }
}

