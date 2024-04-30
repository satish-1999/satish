package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
	int id;
	String name;
	
	public Employee(int id, String name)
	{
		this.id=id;
		this.name=name;		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return 14+id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id ;//&& Objects.equals(name, other.name);
	}

	public static void main(String[] args) 
	{
		Map<Employee,String > mp=new HashMap<>();
		Employee emp1=new Employee(1, "Satish");
		Employee emp2=new Employee(2, "Chandra");
		mp.put(emp1, emp1.getName());
		mp.put(emp2, emp2.getName());
		emp1.setName("Papu");
		//emp1.setId(3);
		System.out.println(mp.get(emp1));
		System.out.println(mp);
		  
	}

}
