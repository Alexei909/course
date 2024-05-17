package lesson2.task1;

public class Truck extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private int maxLoadCapacity;

    public Truck() {}

    public Truck(int numberOfDoors,
                int trunkCapacity,
                int maxLoadCapacity,
                FuelType fuelType) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.maxLoadCapacity = maxLoadCapacity;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapasity() {
        return this.trunkCapacity;
    }

    public int getMaxLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                " numberOfDoors = " + this.numberOfDoors +
                ", trunkCapacity = " + this.trunkCapacity +
                ", maxLoadCapacity = " + this.maxLoadCapacity +
                ", fuelType = " + this.getFuelType() + " }";
    }
}
