package FilePac;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/maksudrustamov/Desktop/File.txt");
        file.createNewFile();
        RandomAccessFile accessFile = new RandomAccessFile("/Users/maksudrustamov/Desktop/File.txt","rw");
        accessFile.writeBytes("Maksud");
    }
}
