import java.util.*;

public class ElementFinder {
    public static void main(String... args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(containsSeven(arrayList));

    }
        public static String containsSeven(ArrayList<Integer> arrayList){
            String answer;
            if (arrayList.contains(7)){
                answer = "Hoooray!";
            } else {
                answer = "Noooo!";
            }
            return answer;
        }
    }
