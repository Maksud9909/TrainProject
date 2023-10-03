package Test1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new
                ObjectInputStream(new FileInputStream("Worker.bin"))){
            System.out.println(inputStream.readObject());
        }
    }
}
