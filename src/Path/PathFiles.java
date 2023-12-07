package Path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Objects;

public class PathFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/maksudrustamov/Desktop/File.txt");
        Path directoryPath = Paths.get("/Users/maksudrustamov/Desktop/ForFiles");


        Path targetPath = directoryPath.resolve(path.getFileName());
        Files.copy(path,targetPath);

        Map<String, Object> map = Files.readAttributes(path,"*");
        map.forEach((first,second)-> System.out.println(first + " " + second));




    }
}
