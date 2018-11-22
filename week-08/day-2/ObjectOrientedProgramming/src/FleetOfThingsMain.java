public class FleetOfThingsMain {

    public static void main(String[] args) {
        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove the obstacles");
        Thing thing3 = new Thing("Stand up");
        Thing thing4 = new Thing("Eat lunch");


        Fleet fleet = new Fleet();
        fleet.add(thing1);
        fleet.add(thing2);
        fleet.add(thing3);
        fleet.add(thing4);
        fleet.add(new Thing("Próba"));

        thing3.complete();
        thing4.complete();

        System.out.println(fleet);
    }
}
