package CarCompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String toString() {
        return "CarSkeleton" +"name"+ name + "description" + description;
    }


    public String startEngine(){
        return ("CarSkeleton engine is starting");
    }

    public String drive(){
        return ("CarSkeleton is driving");
    }

    protected void runEngine() {
        System.out.println("Motor is running.");
    }

}
