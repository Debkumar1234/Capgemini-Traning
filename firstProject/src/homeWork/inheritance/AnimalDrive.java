package homeWork.inheritance;

public class AnimalDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog dog = new Dog();
		Animal dog = new Dog(); // Upcasting
		Dog newDog = (Dog) dog; //Downcasting
		newDog.sound();
		
//		dog.name = "Tommy";
		dog.sound();
		dog.legCount = 4;
	}

}

//   Animal
//	   ^
//	   |
//	   |
//	  Dog extends Animal
// there are some cases 
// Animal dog = new Dog()
// Dog dog = new Dog();