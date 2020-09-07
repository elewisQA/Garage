package garage;

public class Runner {

	public static void main(String[] args) {
		Garage gg = new Garage();
		Motorbike motor =  new Motorbike(1,"Suzuki", 2, 400,80000);
		Truck truck = new Truck(2,"Lorry", 8, 150, 60000);
		Car car = new Car(3,"Tesla", 4, 200, 70000);

		gg.addVehicle(motor);
		gg.addVehicle(truck);
		gg.addVehicle(car);

		gg.fixVehicle(1);
		gg.removeVehicle(1);

		gg.removeAllVehicles();


	}

}
