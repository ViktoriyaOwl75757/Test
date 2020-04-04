import java.util.Scanner;

public class Matrix {
    public static void readMatrixByUser()
    {
        int m, n, i, j;
        Scanner in = null;
        try {
            in = new Scanner(System.in);
            System.out.println("Введите число "
                    + "строк матрицы");
            m = in.nextInt();
            System.out.println("Введите число "
                    + "столбцов матрицы");
            n = in.nextInt();
            int first[][] = new int[m][n];
            System.out.println("Введите элементы матрицы");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();
            System.out.println("\n" +
                    "Элементами матрицы являются");

            for (j = 0; j < n; j++)
                System.out.print(first[0][j] * 3 + " ");
            System.out.println();
        }
        catch (Exception e) {
        }
        finally {
            in.close();
        }
    }
    public static void main(String[] args)
    {
        readMatrixByUser();
    }
}
