import java.io.*;

public class CopiesTwo {
    public static void main (String [] args) throws IOException {
        String s = "";

        try(FileReader fileReader = new FileReader("text.txt");
            FileWriter fileWriter = new FileWriter("copiedText.txt")) {

            int inChar = fileReader.read();
            while (fileReader.ready()) {
                s += (char) inChar;
                inChar = fileReader.read();
                s += (char) inChar;
            }
            fileWriter.write(s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

