<<<<<<< HEAD
package garage;

public class Motorbike extends Vehicle{


    Motorbike(int id, String name, int wheelCount, double speed, int value, String type) {
        super(id,name, wheelCount, speed, value, type);
    }

    public void setWheelCount(int wheelCount) {

    }
}
=======
package garage;

public class Motorbike extends Vehicle{


    Motorbike(int id, String name, int wheelCount, double speed, int value) {
        super(id,name, wheelCount, speed, value);
        type = "motorbike";
    }

    public void setWheelCount(int wheelCount) {

    }
}
>>>>>>> b586e1697cb77df17472a27512caea3e75da6a1c
