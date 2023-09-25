package task2;

public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    public double calculateAllowedSpeed() {
        return maxSpeed * 0.8;
    }


}
