package Test2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccesFilee {
    public static void main(String[] args) throws IOException {
        try(RandomAccessFile file =  new RandomAccessFile("Maksud.txt","rw")){
            file.writeBytes("Hello my name is Maksud, so i promise, that i will be leader one day");
            file.seek(0);

            String line = file.readLine();
            System.out.println(line);
            System.out.println(file.getFilePointer());
        }
    }
}
