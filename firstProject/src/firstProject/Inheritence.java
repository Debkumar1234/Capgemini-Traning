package firstProject;

class Animal{
	String name;
	public void sound() {};
}

class Dog extends Animal{
	public void sound() {
		System.out.println("Bhok Bhok");
	}
}

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Dog();
		dog.name = "Tommy";
		dog.sound();
	}

}
