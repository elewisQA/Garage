package garage;

public class Motorbike extends Vehicle{


    Motorbike(int id, String name, int wheelCount, double speed, int value) {
        super(id,name, wheelCount, speed, value);
        type = "motorbike";
    }

    public void setWheelCount(int wheelCount) {

    }
}
