import java.util.Optional;

public class map {
	
	public static void main(String[] args) {
		
		Employee e = new Employee(2,"teja");
		
		Optional<Employee> oe = Optional.of(e);
		
		Optional<String> a = oe.map(s->s.name="mamidi");
		
		System.out.println(a);
		
		System.out.println(e.getName());
		
	}

}
