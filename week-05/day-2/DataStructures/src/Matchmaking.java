import java.util.ArrayList;
import java.util.Arrays;

public class Matchmaking {
    public static void main(String... args){
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){
        ArrayList <String> matches = new ArrayList();
        int minLength = Math.min(girls.size(),boys.size());
        for (int i = 0; i < minLength; i++) {
            matches.add(girls.get(i));
            matches.add(boys.get(i));
        }
        return matches;
    }
}
