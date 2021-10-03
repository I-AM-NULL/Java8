import java.util.Optional;

public class filter {

	public static void main(String[] args) {
		 
		Employee e = new Employee(1,"sai");
		
		
	    Optional<Employee> oe = Optional.of(e);
	    
	    oe.filter(s->s.id==1).ifPresent(s->System.out.println(s.id + "  " +s.name));
	}

}
