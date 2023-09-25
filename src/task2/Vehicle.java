package task2;

public abstract class Vehicle {
    int maxSpeed;
    public double allowedSpeedCoefficient;
    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public abstract double calculateAllowedSpeed();
}