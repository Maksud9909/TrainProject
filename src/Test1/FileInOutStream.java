package Test1;

import java.io.*;
import java.nio.file.Files;

public class FileInOutStream {
    public static void main(String[] args) throws IOException {
        String dataToWrite = "Try to give up using your phone too much";
        byte [] info  = dataToWrite.getBytes();
        try (FileOutputStream fos = new FileOutputStream("Binary.bin")){
            fos.write(info);
        }

        try (FileInputStream fis = new FileInputStream("Binary.bin")){
            int ch;
            while ((ch = fis.read()) !=-1){
                System.out.print((char)ch);
            }
        }
    }
}
