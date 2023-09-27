package Car;

public class Holden extends CarMain {
    public Holden (int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        System.out.println("Holden engine is starting");
        return "Holden engine is starting";
    }

    public String accelerate() {
        System.out.println("Holden is accelerating");
        return "Holden is accelerating";
    }

    public String brake() {
        System.out.println("Holden is braking");
        return "Holden is braking";
    }
}

