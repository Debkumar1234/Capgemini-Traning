package objects.to_string;

public class Employee {
	int id;
	String name;
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee id = " + id + ", name = "+name;
	}
}
