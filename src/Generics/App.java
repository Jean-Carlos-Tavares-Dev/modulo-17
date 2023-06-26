package Generics;

public class App {

	public static void main(String[] args) {
		CarList<Car> carList = new CarList<>();
		Volvo c1 = new Volvo("Volvo");
		HB20 HB = new HB20 ("HB20");
		GOL gol = new GOL ("GOL");
		
		carList.addCar(c1);
		carList.addCar(HB);
		carList.addCar(gol);	

		carList.printCars();
	}

}
