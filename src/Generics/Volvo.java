package Generics;

public class Volvo extends Car{
	public Volvo (String carro) {
		super(carro);
	}

	@Override
	public void start() {
		System.out.println("Seu carro é o Volvo");
		
	}

}
