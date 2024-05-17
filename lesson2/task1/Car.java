package lesson2.task1;

public abstract class Car implements Vehicle {
    
    private FuelType fuelType;

    public Car() {}

    public Car(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    abstract int getNumberOfDoors();

    abstract int getTrunkCapasity();

    @Override
    public void start() {
        System.out.println("The car is started");
    }

    @Override
    public void stop() {
        System.out.println("The car is stoped");
    }

    @Override
    public FuelType getFuelType() {
        return this.fuelType;
    }
}
