import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

// Open a file called "my-file.txt"
// Write your name in it as a single line
// If the program is unable to write the file,
// then it should print an error message like: "Unable to write file: my-file.txt"

public class WriteSingleLine {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Edit Zsófia Pusztai");
        try {
            Path filePath = Paths.get("src/my-second-file.txt");
            Files.write(filePath, names);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-second-file.txt");
        }
    }
}