import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        double rate, rub, res ;
        Scanner in = null;
        in = new Scanner(System.in);
        System.out.println("Ввести курс доллара");
        rate = in.nextDouble();
        System.out.println("Ввести количество рублей");
        rub = in.nextDouble();
        res=rub/rate;
        String j = String.format("%.2f",res);
        System.out.println(j);
    }
}