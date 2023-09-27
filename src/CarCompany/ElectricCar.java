package CarCompany;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public String toString() {
        return "name" + getName() + '\'' +
                "description" + getDescription() + '\'' +
                "avgKmPerCharge=" + avgKmPerCharge +
                "batterySize=" + batterySize +
                '}';
    }


    @Override
    public String startEngine() {
        return "ElectricCar engine is start";
    }

    @Override
    public String drive() {
        return "ElectricCar is drive";
    }
}
