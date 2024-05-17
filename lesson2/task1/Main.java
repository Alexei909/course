package lesson2.task1;

public class Main {

    public static void main(String[] args) {
        Sedan sedan = new Sedan(4, 200, LuxuryLevel.C, FuelType.PETROL);
        Truck truck = new Truck(2, 1000, 5000, FuelType.DIESEL);

        System.out.println(sedan);
        System.out.println(truck);

        //
        System.out.println("""
                Sedan {
                    numberOfDoors = %d,
                    trunkCapasity = %d,
                    fuelType = %s,
                    luxuryLevel = %s
                }""".formatted(
                        sedan.getNumberOfDoors(), 
                        sedan.getTrunkCapasity(), 
                        sedan.getFuelType(),
                        sedan.getLuxuryLevel()));

        //
        System.out.println("""
                Truck {
                    numberOfDoors = %d,
                    trunkCapasity = %d,
                    fuelType = %s,
                    maxLoadCapasity = %d
                }""".formatted(
                        truck.getNumberOfDoors(), 
                        truck.getTrunkCapasity(), 
                        truck.getFuelType(),
                        truck.getMaxLoadCapacity()));
    }
}
