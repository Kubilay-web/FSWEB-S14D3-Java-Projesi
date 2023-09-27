package Car;

public class Ford extends CarMain {
    public Ford (int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine(){
        System.out.println("Ford engine is starting");
        return "Ford engine is starting";
    }

    public String accelerate() {
        System.out.println("Ford is accelerating");
        return "Ford is accelerating";
    }

    public String brake() {
        System.out.println("Ford is braking");
        return "Ford is braking";
    }
}

