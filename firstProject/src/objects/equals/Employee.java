package objects.equals;

public class Employee {
	int id;
	
	Employee(int id){
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false;
		Employee e = (Employee) obj;
		return this.id == e.id;
	}
}
