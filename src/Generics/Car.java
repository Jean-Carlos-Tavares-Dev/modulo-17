package Generics;

public abstract class Car {

	private String carro;
	
	public Car (String carro) {
		this.carro=carro;
		
	}
	public String getCarro() {
		return carro;
	}
	public abstract void start(); 
}
