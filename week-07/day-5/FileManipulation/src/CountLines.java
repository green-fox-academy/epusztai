import javax.xml.bind.SchemaOutputResolver;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {
        String fileName = "my-file.txt";
        System.out.println(countLines(fileName));
    }

    public static int countLines(String file) {
        Path filePath = Paths.get("src/my-file.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file);
            return 0;
        }
        return lines.size(); //returns the number of lines in the file
    }
}
