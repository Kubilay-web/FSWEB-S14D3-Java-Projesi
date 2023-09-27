package Main;
import Car.CarMain;
import Car.Mitsubishi;
import Car.Ford;
import Car.Holden;
import CarCompany.CarSkeleton;
import CarCompany.ElectricCar;
import CarCompany.GasPoweredCar;
import CarCompany.HybridCar;

public class Main {
    public static void main(String[] args) {
        CarMain car = new CarMain(12, "Hybrid Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println(car);

        CarMain mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi);

        CarMain ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford);

        CarMain holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden);

        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric car", 200.0, 100);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println("Type "+electricCar.getType());
        System.out.println(electricCar);

        CarSkeleton gasCar  = new GasPoweredCar("GasPoweredCar", "GasPoweredCar", 200.0, 100);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());
        System.out.println("Type "+gasCar.getType());
        System.out.println(gasCar);

        CarSkeleton hybridCar = new HybridCar("Opel Mokka", "Hybrid car", 20.0, 50, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
        System.out.println("Type "+hybridCar.getType());
        System.out.println(hybridCar);



    }
}