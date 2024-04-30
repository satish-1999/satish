package duplicate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Employee 
{
	String name;
	String dept;
	int salary;
	
	Employee(String name , String dept, int salary)
	{
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		Employee e1=new Employee("Narendra", "CS", 200000);
		Employee e2=new Employee("Kumar", "Acc", 300000);
		Employee e3=new Employee("Papu", "Market", 600000);
		Employee e4=new Employee("Modi", "HR", 500000);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
//		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
//		
//		Map<String, Optional<Employee>> collect = 
//		        list.stream().collect(
//		            Collectors.groupingBy(
//		                Employee::getDept,
//		                Collectors.reducing(BinaryOperator.maxBy(bysalary))
//		    )
//		);
		
//		Map<String, Employee> topEmployees =
//			    list.stream()
//			                .collect(groupingBy(
//			                    e -> e.department,
//			                    collectingAndThen(maxBy(comparingInt(e -> e.salary)), Optional::get) 
//			                ));
		
	}
}
