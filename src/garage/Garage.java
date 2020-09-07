package garage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Garage {
    List<Vehicle> allVehicle = new ArrayList<Vehicle>();


    public void addVehicle(Vehicle v){
        allVehicle.add(v);

    }

    public void removeVehicle(int id){
        for(Vehicle v: allVehicle){
            if(v.getID()==id){
                allVehicle.removeIf(Predicate.isEqual(v));
                System.out.println("Vehicle removed!");
                break;

            }else{
                System.out.println("No entry");
            }
        }
    }

    public void removeVehicle(String type){
        for(Vehicle v: allVehicle){
            if (v.getType().equals(type)) {
                allVehicle.removeIf(Predicate.isEqual(v));
            }
        }
    }

    public  void removeAllVehicles(){
        allVehicle.clear();
        System.out.println("The Garage is totally empty");

    }
    public void fixVehicle(int id){
        for(Vehicle v: allVehicle){
            switch (v.getType()) {
                case "motorbike":
                    System.out.printf("Total Cost for a motorbike is %d.\n", v.getWheelCount() * 200);
                    break;
                case "car":
                    System.out.printf("Total Cost for a car is %d.\n", v.getWheelCount() * 160);
                    break;
                case "truck":
                    System.out.printf("Total Cost for a truck is %d.\n", v.getWheelCount() * 300);
                    break;
                default:
                    System.out.println("Cannot service this kind of vehicle.");
                    break;
            }
        }
    }

}
