package Car;

public class CarMain {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public CarMain (int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car "+ "engine "+engine+ "cylinders "+ cylinders+ "name "+name+ "wheels "+wheels;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarMain car = (CarMain) o;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine(){
        System.out.println("the car's engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println("the car is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println("the car is braking");
        return "the car is braking";
    }


}