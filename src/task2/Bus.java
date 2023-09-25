package task2;

public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed);
    }
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.6;
    }


}
