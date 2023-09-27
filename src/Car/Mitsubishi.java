package Car;

 public class Mitsubishi extends CarMain {
     public Mitsubishi(int cylinders, String name) {
         super(cylinders, name);
     }

     public String startEngine(){
         System.out.println("Mitsubishi engine is starting");
         return "Mitsubishi engine is starting";
     }

     public String accelerate() {
         System.out.println("Mitsubishi is accelerating");
         return "Mitsubishi is accelerating";
     }

     public String brake() {
         System.out.println("Mitsubishi is braking");
         return "Mitsubishi is braking";
     }
}
