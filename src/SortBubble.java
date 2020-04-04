import java.util.Scanner;
public class SortBubble {
    public static void main(String []args) {
        int n, c, d, swap;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива");
        n = in.nextInt();

        int array[] = new int[n];

        System.out.println("Ввод " + n + " чисел");

        for (c = 0; c < n; c++)
            array[c] = in.nextInt();

        for (c = 0; c < ( n - 1 ); c++) {
            for (d = 0; d < n - c - 1; d++) {
                if (array[d] > array[d+1]) 
                {
                    swap       = array[d];
                    array[d]   = array[d+1];
                    array[d+1] = swap;
                }
            }
        }

        System.out.println("\n" + "Сортированный массив:");

        for (c = 0; c < n; c++)
            System.out.println(array[c]);
    }
}




