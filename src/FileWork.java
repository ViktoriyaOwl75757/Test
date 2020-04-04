import java.io.*;
import java.util.Scanner;
public class FileWork {
    public static void main(String[] args) {

        File f = new File("C:/Users/vikto/OneDrive/Рабочий стол/text.txt");
        read(f);
        write(f);
    }
    public static void read (File f){

        try (FileReader reader = new FileReader(f)) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    public static void write ( File f){
        try (FileWriter writer = new FileWriter(f, false)) {
            Scanner scan = new Scanner(System.in);
            System.out.println('\n' + "Введите строку"+'\n');
            String s = scan.nextLine();
            writer.write(s);

            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}