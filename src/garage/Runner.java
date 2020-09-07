package garage;

public class Runner {

	public static void main(String[] args) {
		Garage gg = new Garage();
		Vehicle motor =  new Motorbike(1,"Suzuki", 2, 400,80000, "motor");
		Vehicle truck = new Truck(2,"Lorry", 8, 150, 60000, "truck");
		Vehicle car1 = new Car(3,"Tesla", 4, 200, 70000, "car");
		Vehicle car2 = new Car(3,"Audi", 4, 450, 80000, "car");

		gg.addVehicle(motor);
		gg.addVehicle(truck);
		gg.addVehicle(car1);
		gg.addVehicle(car2);

		gg.fixVehicle(1);
		gg.removeVehicle(1);

		gg.removeSameType("car");


		gg.removeAllVehicles();


	}

}
