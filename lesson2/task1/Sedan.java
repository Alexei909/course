package lesson2.task1;

public class Sedan extends Car {

    private int numberOfDoors;
    private int trunkCapacity;
    private LuxuryLevel luxuryLevel;

    public Sedan() {}

    public Sedan(int numberOfDoors, 
                int trunkCapacity,
                LuxuryLevel luxuryLevel,
                FuelType fuelType) {
        super(fuelType);
        this.numberOfDoors = numberOfDoors;
        this.trunkCapacity = trunkCapacity;
        this.luxuryLevel = luxuryLevel;
    }

    @Override
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getTrunkCapasity() {
        return this.trunkCapacity;
    }

    public LuxuryLevel getLuxuryLevel() {
        return this.luxuryLevel;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                " numberOfDoors = " + this.numberOfDoors + 
                ", trunkCapacity = " + this.trunkCapacity +
                ", luxuryLevel = " + this.luxuryLevel + " (" + this.luxuryLevel.getTitle() + ")" +
                ", fuelType = " + this.getFuelType() + " }";
    }

}
