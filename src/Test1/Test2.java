package Test1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String info = "My name is Maqsud, i am 18 years old, and i study at wiut";
        try(
            RandomAccessFile accessFile = new RandomAccessFile("Info.txt","rw")
        ){
            accessFile.write(info.getBytes());
            accessFile.seek(0);
            int ch;
            while ((ch = accessFile.read()) !=-1){
                System.out.print((char) ch);
            }
        }
    }
}
