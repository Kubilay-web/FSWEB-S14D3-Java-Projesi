package CarCompany;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", avgKmPerLitre=" + avgKmPerLitre +
                ", cylinders=" + cylinders +
                '}';
    }


    @Override
    public String startEngine() {
        return "GasPoweredCar engine is starting.";
    }

    @Override
    public String drive() {
        return "GasPoweredCar is drive.";
    }

}
