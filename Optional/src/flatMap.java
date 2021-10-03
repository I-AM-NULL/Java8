import java.util.Optional;

public class flatMap {
	
	public static void main(String[] args) {
		
Employee e = new Employee(3,"mamidi");
		
		Optional<Employee> oe = Optional.of(e);
		
		Optional<Integer> a = oe.map(Employee::getnonoptionalid); // if inner method return type is Datatypes 
		Optional<Integer> a1 = oe.flatMap(Employee::getOptionalid);// if inner method return type is Optional
		
		System.out.println(a);
		
		System.out.println(e.getName());
	}

}
