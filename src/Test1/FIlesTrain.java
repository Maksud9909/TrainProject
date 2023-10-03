package Test1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FIlesTrain {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/maksudrustamov/Desktop/FileTrain.txt");
        String content = "I promise, that i will find a job, or at least will be at the interview until this year";

        List <String> lines = Files.readAllLines(path);
        lines.forEach(el-> System.out.println(el));

    }
}
