package Generics;

import java.util.ArrayList;
import java.util.List;

public class CarList <T extends Car> {
	private List <T> cars;
	
	public CarList() {
		cars = new ArrayList<>();
	}
	public void addCar(T car) {
		cars.add(car);
	}
	public void printCars() {
		for ( T car: cars) {
			System.out.println(car.getCarro());
		}
	}

	
}
