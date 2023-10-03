package Test2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/Users/maksudrustamov/Desktop/FileTrain.txt");
        Path path2 = Paths.get("/Users/maksudrustamov/Desktop/Copy.txt");
        Files.copy(path1,path2);
        List<String> lines = Files.readAllLines(path2);
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
