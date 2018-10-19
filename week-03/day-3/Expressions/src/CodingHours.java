public class CodingHours {

    public static void main(String[] args) {

        int a = 6;  // 1 day= 6 hours
        int b = 5;  // 1 week= 5 working days
        int c = 17; // 1 semester = 17 weeks

        int d = a * b * c;

        System.out.println("The hours are spent with coding in a semester by an attendee:");
        System.out.println(d);


        int e = 52; //1 week = 52 working hours averagely

        System.out.println("Avereage working hours in 17 weeks: ");
        int f = e * c;

        System.out.println(f);

        System.out.println("The percentage of the coding hours in the semester:");

        double g = (510. / 884);

        System.out.println((g*100)+(" %"));

    }
}

