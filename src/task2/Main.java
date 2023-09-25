package task2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(120);
        Bus bus1 = new Bus(90);
        SpeedCalculation sc = new SpeedCalculation();
        System.out.println(sc.calculateAllowedSpeed(car1));
        System.out.println(sc.calculateAllowedSpeed(bus1));
    }
}
