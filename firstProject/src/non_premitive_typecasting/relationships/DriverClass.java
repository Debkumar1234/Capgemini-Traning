package non_premitive_typecasting.relationships;

import java.util.Scanner;

public class DriverClass {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		System.out.println("Which engine to fit?");
		System.out.println("1. Petrol Engine");
		System.out.println("2. Diesel Engine");
		System.out.println("Enter your choice : ");
		byte userChoice = userInput.nextByte();
		userInput.nextLine();
		Engine engine = null;

		switch (userChoice) {
		case 1:
			PetrolEngine petrolEngine = new PetrolEngine();
			engine = petrolEngine; // upcastedParent variable -> engine
			break;
		case 2:
			DieselEngine dieselEngine = new DieselEngine();
			engine = dieselEngine; // upcastedParent variable -> engine
			break;
		default:
			PetrolEngine petrolEngine1 = new PetrolEngine();
			engine = petrolEngine1; // upcastedParent variable -> engine
			break;
		}

		car.engine = engine;

//		switch (userChoice) {
//		case 1:
//			PetrolEngine petrolEngine = (PetrolEngine) engine;
//			petrolEngine.startEngine(); // downCastedChild variable -> petrolEngine
//			break;
//		case 2:
//			DieselEngine dieselEngine = (DieselEngine) engine;
//			dieselEngine.startEngine(); // downCastedChild variable -> dieselEngine
//			break;
//		default:
//			break;
//		}
		String engineClass = engine.getClass().toString();
		Boolean isPetrolEngine = engineClass.contains("PetrolEngine");
		Boolean isDieselEngine = engineClass.contains("DieselEngine");
		if(isPetrolEngine) {
			PetrolEngine petrolEngine = (PetrolEngine) engine;
			petrolEngine.startEngine();
		}else if(isDieselEngine) {
			DieselEngine dieselEngine = (DieselEngine) engine;
			dieselEngine.startEngine();
		}else {
			System.out.println("The car doesn't have engine");
		}
	}
}
