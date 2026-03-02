package objects.clone;

public class Employee implements Cloneable{
	int id;
	Employee(int id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
