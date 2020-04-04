import java.io.*;
public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("C:/Users/vikto/OneDrive/Рабочий стол/text.txty");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String name;
        String line;
        System.out.println("Print File " + f.getName() + "? y/n");
        name = br.readLine();
        if (name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);
    }
}

