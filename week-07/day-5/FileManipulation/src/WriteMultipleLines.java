import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

public class WriteMultipleLines {
    public static void main(String[] args) {
        String path = "src/lines.txt";
        String word = "apple";
        int number = 5;
        writeLines(path, word, number);
    }

    public static void writeLines(String path, String word, int number) {
        ArrayList<String> fileContent = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            fileContent.add(i, word);
        }
        try {
            Path filepath = Paths.get(path);
            Files.write(filepath, fileContent);
        } catch (IOException e) {
        }
    }
}
