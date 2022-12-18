import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Copies {
//    Напиши код, который мог бы копировать строку из одного файла в другой.
    public static void main (String [] args) throws IOException {
        String s = "";

        try (InputStreamReader actionOne = new InputStreamReader(System.in);
            FileWriter actionTwo = new FileWriter("text.txt")) {
            System.out.println("Print your line");
            int inChar = actionOne.read();
            while (actionOne.ready()) {
                s += (char) inChar;
                inChar = actionOne.read();
            }
            actionTwo.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}