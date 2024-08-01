package Train;

import java.io.*;

public class Files {
    public static void main(String[] args) throws IOException {
        String rap = "I love you, baby\n" +
                "And if it's quite all right\n" +
                "I need you, baby\n" +
                "To warm these lonely nights\n" +
                "I love you, baby\n" +
                "Trust in me when I say\n" +
                "I love you, baby\n" +
                "And if it's quite all right\n" +
                "I need you, baby\n";



        BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
        String line;
        while ((line = reader.readLine()) !=null){
            System.out.println(line);
        }

    }
}
