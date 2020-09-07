package garage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
    public void removeSameType(String type){

        //allVehicle.stream().filter(Predicate.isEqual(type));
        for(Vehicle v: allVehicle){
            if(v.getType()==type){
                allVehicle.removeIf(Predicate.isEqual(v));
                System.out.println("Vehicle removed!");
            }
        }
    }
    public  void removeAllVehicles(){
        System.out.println(allVehicle.size());
        allVehicle.clear();
        System.out.println("The Garage is totally empty");

    }
    public void fixVehicle(int id){
        for(Vehicle v: allVehicle){
            if(v.getID()==id){
                System.out.printf("The total wheel %d is %d \n", v.getWheelCount(), v.getWheelCount()*200);
            }
        }
    }

}
