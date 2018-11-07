import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class palindromeSearcher {
    public static void main(String[] args) {
        String word = "racecar";
        System.out.println(checkPalindrome(word));
        System.out.println(findPalindromes(word));

    }

    public static boolean checkPalindrome(String string) {
        char[] wordArray = string.toCharArray();
        boolean ifPalindrome = false;
        for (int i = 0; i < wordArray.length / 2; i++) {
            if (wordArray[i] == wordArray[wordArray.length - 1 - i]) {
                int count = 0;
                count = count + 1;
                if (count == wordArray.length / 2) ;
                ifPalindrome = true;
            }
        }
        return ifPalindrome;
    }

    public static ArrayList<String> findPalindromes(String originalWord) {
        ArrayList<String> output = new ArrayList<>();
        for (int i = 0; i < originalWord.length() - 2; i++) {
            for (int j = i + 1; j < originalWord.length(); j++) {
                String myString = originalWord.substring(i, j + 1);
                if (checkPalindrome(myString)) {
                    output.add(myString);
                }
            }
        }
        return output;
    }
}
