package objects.equals;

public class Car {
	String name;
	byte noOfDoors;
	public Car(String name, byte noOfDoors) {
		this.name = name;
		this.noOfDoors = noOfDoors;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			System.out.println("Returning true from first if block");
			System.out.println("as both ref. are same");
			return true;
		}
		if(obj == null || getClass() != obj.getClass()) {
			System.out.println("Returning true from 2nd if block");
			System.out.println("as 1 of ref. is null or both ref. are of diff type");
			return false;
		}
		System.out.println(getClass());
		System.out.println(obj.getClass());
		Car c = (Car) obj;
		if(this.name == c.name && this.noOfDoors==c.noOfDoors) {
			System.out.println("Both object members are containing same things");
			return true;
		}
		return false;
	}
	
}
