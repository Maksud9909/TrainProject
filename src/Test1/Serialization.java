package Test1;

import java.io.*;
import java.util.List;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Worker worker = new Worker("Ulugbek","It-Manager",18);


        try (ObjectOutputStream outputStream = new
                ObjectOutputStream(new FileOutputStream("Worker.bin"))){
            outputStream.writeObject(worker);
        }
    }
}
