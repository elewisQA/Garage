<<<<<<< HEAD
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
=======
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
        boolean removed = false;
        for(Vehicle v: allVehicle){
            if (v.getType().equals(type)) {
                allVehicle.removeIf(Predicate.isEqual(v));
                removed = true;
                break;
            }
        }
        if (removed) {
            removeVehicle(type); //I'm sorry for this
        }
    }

    public  void removeAllVehicles(){
        allVehicle.clear();
        System.out.println("The Garage is totally empty");

    }
    public void fixVehicle(int id){
        for(Vehicle v: allVehicle){
            if(v.getType().equals("motorbike") && v.getID() == id){
                System.out.printf("Total Cost for a motorbike is %d.\n", v.getWheelCount() * 200);
            } else if (v.getType().equals("car") && v.getID() == id) {
                System.out.printf("Total Cost for a car is %d.\n", v.getWheelCount() * 160);
            } else if (v.getType().equals("truck") && v.getID() == id) {
                System.out.printf("Total Cost for a truck is %d.\n", v.getWheelCount() * 300);
            }
        }
    }

    public void showVehicles() {
        for (Vehicle v : allVehicle) {
            System.out.println(v.getName());
        }
    }

}
>>>>>>> b586e1697cb77df17472a27512caea3e75da6a1c
