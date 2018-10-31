import java.util.*;
import java.util.ArrayList;

public class SolarSystem {
    public static void main(String... args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        System.out.print(putSaturn(planetList)); }

       public static ArrayList putSaturn(ArrayList planets) {
           planets.add(5, "Saturn");
           return planets;
    }
}
