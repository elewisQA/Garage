<<<<<<< HEAD
package garage;

public class Car  extends Vehicle{

    Car(int id, String name, int wheelCount, double speed, int value, String type) {
        super(id,name, wheelCount, speed, value, type);
    }
}
=======
package garage;

public class Car  extends Vehicle{

    Car(int id, String name, int wheelCount, double speed, int value) {
        super(id,name, wheelCount, speed, value);
        type = "car";
    }
}
>>>>>>> b586e1697cb77df17472a27512caea3e75da6a1c
