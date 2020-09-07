package garage;

public class Vehicle {
    private String name;
    private int wheelCount;
    private double speed;
    private int value;
    private int id;
    private String type;

    Vehicle(int id, String name, int wheelCount, double speed, int value, String type){
        this.id = id;
        this.name = name;
        this.wheelCount = wheelCount;
        this.speed = speed;
        this.value = value;
        this.type = type;

    }

    public void drive(){
        System.out.print("Zoom Zoom");
    }

    public int getWheelCount() {
        return wheelCount;
    }
    public int getID(){
        return id;
    }
    public String getType(){
        return type;
    }

}
