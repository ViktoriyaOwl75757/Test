import java.util.Scanner;

public class DeleteSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String  str = sc.nextLine();

        String str_new = "";
        for(int i = 0; i < str.length(); ++i){

            char symbol = str.charAt(i);

            if(symbol != ' '){
                str_new += symbol;
            }
        }

        str = str_new;
        System.out.print("Результат: " + str);
    }

}