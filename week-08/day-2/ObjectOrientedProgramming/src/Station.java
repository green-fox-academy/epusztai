public class Station {
    private int gasAmount;

    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        car.refill();
        gasAmount -= car.capacity();
    }

    @Override
    public String toString() {
        return "Station{" +
                "gasAmount=" + gasAmount +
                '}';
    }
}
