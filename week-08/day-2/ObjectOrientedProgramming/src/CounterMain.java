public class CounterMain {
    public static void main(String[] args) {
        Counter firstValue = new Counter();
        Counter secondValue = new Counter(25);
        Counter thirdValue = new Counter (100);

        System.out.println(firstValue.toString());
        System.out.println(secondValue.toString());
        System.out.println(thirdValue.toString());
        System.out.println();

        firstValue.add();
        secondValue.add(50);
        thirdValue.add();

        System.out.println(firstValue.toString());
        System.out.println(secondValue.toString());
        System.out.println(thirdValue.toString());

        firstValue.reset();
        secondValue.reset();
        thirdValue.reset();
        System.out.println(firstValue.get());
        System.out.println(secondValue.get());
        System.out.println(thirdValue.get());

        System.out.println(firstValue.toString());
        System.out.println(secondValue.toString());
        System.out.println(thirdValue.toString());
    }
}
