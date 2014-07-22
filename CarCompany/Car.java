package assignment;

public class Car {
	public String carName;
	public int price;
	public int numberOfCar;
	
	public Car(){
		this("Unnamed", 0, 0);
	}

	public Car(String carName, int price, int numberOfCar) {
		this.carName = carName;
		this.price = price;
		this.numberOfCar = numberOfCar;
	}
}
